package hw.stones.source;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hw.stones.chain.entity.Chain;
import hw.stones.entity.Precious;
import hw.stones.entity.SemiPrecious;
import hw.stones.enums.Color;
import hw.stones.enums.Cut;
import hw.stones.enums.MaterialTypeChain;
import hw.stones.enums.MaterialTypePreciousStones;
import hw.stones.enums.MaterialTypeSemiPreciousStones;
import hw.stones.enums.ProbeMetric;
import hw.stones.enums.Transparency;
import hw.stones.enums.Сlarity;
import hw.stones.necklace.entity.Necklace;
import hw.stones.strategy.PriceSelectionStrategy;
import hw.stones.strategy.TotalWeightAndCostStrategy;
import hw.stones.strategy.TransparencySelectStrategy;


@WebServlet("/NecklaceServlet")
public class NecklaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Chain chain;
	private Necklace necklace;

    public NecklaceServlet() {
        super();
        this.necklace = new Necklace();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String isPreciousStone = request.getParameter("stoneSelect");
		String semiPreciousStoneMaterial = request.getParameter("semiPreciousStone").toUpperCase();
		String preciousStoneMaterial = request.getParameter("preciousStone").toUpperCase();
		String clarity = request.getParameter("clarity");
		String color = request.getParameter("color").toUpperCase();
		String cut = request.getParameter("cut").toUpperCase();
		String transparency = request.getParameter("transparency").toUpperCase();
		double stoneWeight = Double.parseDouble(request.getParameter("weight"));
		double stonePrice = Double.parseDouble(request.getParameter("stonePrice"));
		
		String chainMaterial = request.getParameter("chainMeterial").toUpperCase();
		double chainWeight = Double.parseDouble(request.getParameter("chainWeight"));
		double chainPrice = Double.parseDouble(request.getParameter("chainPrice"));
		String probe = request.getParameter("probe");
		String addStone = request.getParameter("addStone");
		String strategy = request.getParameter("strategy");
		String transparencyStrategySelection = request.getParameter("transparencyStrategySelection").toUpperCase();
		
		if (isPreciousStone.equals("Precious")) {
			this.necklace.addStone(new Precious(stonePrice, stoneWeight, Color.valueOf(color), 
						Transparency.valueOf(transparency), 
						MaterialTypePreciousStones.valueOf(preciousStoneMaterial),
						Сlarity.valueOf(clarity), Cut.valueOf(cut)));
		} else if (isPreciousStone.equals("SemiPrecious")) {
			this.necklace.addStone(new SemiPrecious(stonePrice, stoneWeight, Color.valueOf(color), 
					Transparency.valueOf(transparency), 
					MaterialTypeSemiPreciousStones.valueOf(semiPreciousStoneMaterial),
					Cut.valueOf(cut)));
		}
		
		if (addStone.equals("Yes")) {
			response.sendRedirect("StartPage.jsp");
		} else {
			this.chain = new Chain(chainPrice, chainWeight, Transparency.OPAQUE, 
					MaterialTypeChain.valueOf(chainMaterial), ProbeMetric.valueOf(probe));
			
			necklace.setChain(this.chain);
			String result = setStrategy(strategy, transparencyStrategySelection);
			out.print(result);
			this.necklace = new Necklace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected String setStrategy(String strategy, String transparency) {
		String result = "";
		if (strategy.equals("priceSelectionStrategy")) {
			result = new PriceSelectionStrategy().makeSelection(this.necklace);
		} else if (strategy.equals("totalWeightAndCostStrategy")) {
			result = new TotalWeightAndCostStrategy().makeSelection(this.necklace);
		} else {
			result = new TransparencySelectStrategy().selectTransparency(Transparency.valueOf(transparency)).makeSelection(this.necklace);
		}
		return result;
	}

}

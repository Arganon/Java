package hw.stones.source;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hw.stones.builders.BuilderDiamondNecklaceGoldChain;
import hw.stones.builders.Director;
import hw.stones.enums.Transparency;
import hw.stones.necklace.entity.Necklace;
import hw.stones.strategy.PriceSelectionStrategy;
import hw.stones.strategy.TotalWeightAndCostStrategy;
import hw.stones.strategy.TransparencySelectStrategy;


@WebServlet("/NecklaceServlet")
public class NecklaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Necklace necklace;
   
    public NecklaceServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		chooseNecklace(request.getParameter("necklaces"));
		out.println(chooseStrategy(request.getParameter("strategy")));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void chooseNecklace(String choosenNecklaces) {	
		if (choosenNecklaces.equals("brilliantNecklace")) {
			this.necklace = new Director(new BuilderDiamondNecklaceGoldChain()).build();
		}
	}
	
	public String chooseStrategy(String strategyType) {
		if (strategyType.equals("priceSelectionStrategy")) {
			return new PriceSelectionStrategy().makeSelection(necklace);
		} else if (strategyType.equals("totalWeightAndCostStrategy")) {
			return new TotalWeightAndCostStrategy().makeSelection(necklace);
		} else {
			return new TransparencySelectStrategy().selectTransparency(Transparency.TRANSPARENT).makeSelection(necklace);
		}
	}
}

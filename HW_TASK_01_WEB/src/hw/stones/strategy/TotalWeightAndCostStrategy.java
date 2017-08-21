package hw.stones.strategy;

import hw.stones.entity.Material;
import hw.stones.interfaces.Selection;
import hw.stones.necklace.entity.Necklace;

public class TotalWeightAndCostStrategy implements Selection{

	@Override
	public String makeSelection(Necklace necklace) {		
		double stonesWeight = 0L;
		double stonesPrice = 0L;
		int stonesQuantity = 0;
		
		for (Material stone : necklace.getStones()) {
			stonesWeight += stone.getWeight();
			stonesPrice += stone.getTotalPrice();
			++stonesQuantity;
		}
		
		return "Necklace hase " + stonesQuantity + (stonesQuantity >1 ? " stones.\n" : " stone.\n") +
		"Chain weight " + necklace.getChain().getWeight()	 + " carats\n" +
		"Chain price " + necklace.getChain().getTotalPrice() + " dollars\n" +
		"Total stones weight " + stonesWeight + " carats\n" + 
		"Total stones price " + stonesPrice + " dollars\n";
	}

}

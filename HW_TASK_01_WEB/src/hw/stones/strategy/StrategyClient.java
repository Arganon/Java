package hw.stones.strategy;

import hw.stones.interfaces.Selection;
import hw.stones.necklace.entity.Necklace;

public class StrategyClient {
	Selection selection;
	
	public StrategyClient setStrategy(Selection selection) {
		this.selection = selection;
		return this;
	}
	
	public String executeStrategy(Necklace necklace) {
		return selection.makeSelection(necklace);
	}
}

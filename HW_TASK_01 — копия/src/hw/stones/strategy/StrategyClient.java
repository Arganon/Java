package hw.stones.strategy;

import hw.stones.interfaces.Selection;
import hw.stones.necklace.entity.Necklace;

public class StrategyClient {
	Selection selection;
	
	public void setStrategy(Selection selection) {
		this.selection = selection;
	}
	
	public void executeStrategy(Necklace necklace) {
		selection.makeSelection(necklace);
	}
}

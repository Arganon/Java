
package hw.stones.source;

import hw.stones.builders.BuilderDiamondNecklaceGoldChain;
import hw.stones.builders.Director;
import hw.stones.necklace.entity.Necklace;
import hw.stones.strategy.PriceSelectionStrategy;
import hw.stones.strategy.StrategyClient;

public class Main {

	public static void main(String[] args) {
		Necklace necklace = new Director(new BuilderDiamondNecklaceGoldChain()).build();
//		System.out.println(necklace);
		
		StrategyClient sc = new StrategyClient();
		PriceSelectionStrategy strategy = new PriceSelectionStrategy();
		sc.setStrategy(strategy);
		sc.executeStrategy(necklace);
	}
}


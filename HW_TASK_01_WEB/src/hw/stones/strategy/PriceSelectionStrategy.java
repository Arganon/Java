package hw.stones.strategy;

import java.util.ArrayList;
import java.util.stream.Collectors;

import hw.stones.entity.Material;
import hw.stones.necklace.entity.Necklace;

public class PriceSelectionStrategy extends Strategy {

	public String makeSelection(Necklace necklace) {
		String result = null;
		
		ArrayList<Material> stones = (ArrayList<Material>) necklace.getStones()
				.stream().sorted((first, second) -> Double.compare(first.getTotalPrice(), second.getTotalPrice()))
				.collect(Collectors.toList());
		
		for (Material stone : stones) {
			result += stone.toString();
			result +="\n";
		}
		return result;
	}
}

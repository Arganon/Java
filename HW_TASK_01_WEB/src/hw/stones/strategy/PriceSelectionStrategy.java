package hw.stones.strategy;

import java.util.ArrayList;
import java.util.stream.Collectors;

import hw.stones.entity.Material;
import hw.stones.interfaces.Selection;
import hw.stones.necklace.entity.Necklace;

public class PriceSelectionStrategy implements Selection {

	@Override
	public String makeSelection(Necklace necklace) {
		String result = "";
		ArrayList<Material> stones = (ArrayList<Material>) necklace.getStones()
				.stream().sorted((first, second) -> Double.compare(first.getTotalPrice(), second.getTotalPrice()))
				.collect(Collectors.toList());
		
		for (Material stone : stones) {
			result += stone.toString();
		}
		return result;
	}
}

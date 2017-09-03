package hw.stones.strategy;

import java.util.ArrayList;
import java.util.stream.Collectors;

import hw.stones.entity.Material;
import hw.stones.enums.Transparency;
import hw.stones.interfaces.MaterialProperties;
import hw.stones.necklace.entity.Necklace;

public class TransparencySelectStrategy extends Strategy {
	Transparency t;

	public String makeSelection(Necklace necklace) {
		String result = null;
		
		ArrayList<Material> stones = (ArrayList<Material>) necklace.getStones().stream()
				.filter(stone -> compare(stone.getTransparency())).collect(Collectors.toList());
		
		for (Material stone : stones) {
			result += stone.toString();
			result += "\n";
		}
		return result;
	}
	
	public TransparencySelectStrategy selectTransparency(Transparency t) {
		this.t = t;
		return this;
	}
	
	private boolean compare(MaterialProperties materialProperties) {
		if (materialProperties == t) {
			return true;
		}
		return false;
	}
}

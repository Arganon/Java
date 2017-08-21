package hw.stones.strategy;

import java.util.ArrayList;
import java.util.stream.Collectors;

import hw.stones.entity.Material;
import hw.stones.enums.Transparency;
import hw.stones.interfaces.MaterialProperties;
import hw.stones.interfaces.Selection;
import hw.stones.necklace.entity.Necklace;

public class TransparencySelectStrategy implements Selection {
	Transparency t;
	@Override
	public void makeSelection(Necklace necklace) {
		ArrayList<Material> result = (ArrayList<Material>) necklace.getStones().stream()
				.filter(stone -> compare(stone.getTransparency())).collect(Collectors.toList());
		for (Material stone : result) {
			System.out.println(stone);
		}
	}
	
	public void selectTransparency(Transparency t) {
		this.t = t;
	}
	
	private boolean compare(MaterialProperties materialProperties) {
		if (materialProperties == t) {
			return true;
		}
		return false;
	}

}

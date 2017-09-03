package hw.stones.strategy;

import hw.stones.interfaces.MaterialProperties;
import hw.stones.necklace.entity.Necklace;

public abstract class Strategy {
	private MaterialProperties transparency;
	
	abstract String makeSelection(Necklace necklace);
	void setTransparency(MaterialProperties transparency) {
		this.transparency = transparency;
	}
}

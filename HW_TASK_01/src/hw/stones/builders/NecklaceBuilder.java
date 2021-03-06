package hw.stones.builders;

import hw.stones.necklace.entity.Necklace;

public abstract class NecklaceBuilder {
	Necklace necklace;
	
	void createNecklace() {
		this.necklace = new Necklace();
	}
	abstract void makeChain();
	abstract void setStone();
	Necklace getNecklace() {
		return necklace;
	}
}

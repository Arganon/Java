package hw.stones.builders;

import hw.stones.necklace.entity.Necklace;

public class Director {
	NecklaceBuilder builder;
	
	public Director() {}
	
	public Director(NecklaceBuilder builder) {
		setBuilder(builder);
	}
	
	public void setBuilder(NecklaceBuilder builder) {
		this.builder = builder;
	}
	
	public Necklace build() {
		builder.createNecklace();
		builder.makeChain();
		builder.setStones();
		return builder.getNecklace();
	}
}

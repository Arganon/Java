package hw.stones.chain.entity;

import hw.stones.entity.Material;
import hw.stones.interfaces.MaterialProperties;

public class Chain extends Material {
	private MaterialProperties probe;

	public Chain(double price, double weight, MaterialProperties transparency, 
			MaterialProperties materialType, MaterialProperties probe) {
		super(price, weight, transparency, materialType);
		setProbe(probe);
		
	}
	
	public MaterialProperties getProbe() {
		return probe;
	}
	
	public void setProbe(MaterialProperties probe) {
		this.probe = probe;
	}

	@Override
	public String toString() {
		return "Chain probe = " + getProbe() + "\nPrice for the one carat = " + getPrice() + "\n" + super.toString();
	}
	
}

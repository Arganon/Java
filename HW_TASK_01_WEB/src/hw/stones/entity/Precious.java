package hw.stones.entity;

import hw.stones.interfaces.MaterialProperties;

public class Precious extends Material {
	private MaterialProperties clarity;
	private MaterialProperties cut;
	private MaterialProperties color;
	
	public Precious() {}
	
	public Precious(double price, double weight, MaterialProperties color, 
			MaterialProperties transparency, MaterialProperties materialType,
			MaterialProperties clarity, MaterialProperties cut) {
		super(price, weight, transparency, materialType);
		setClarity(clarity);
		setCut(cut);
		setColor(color);
	}
	public MaterialProperties getColor() {
		return color;
	}

	public void setColor(MaterialProperties color) {
		this.color = color;
	}
	public MaterialProperties getClarity() {
		return clarity;
	}
	public void setClarity(MaterialProperties clarity) {
		this.clarity = clarity;
	}
	public MaterialProperties getCut() {
		return cut;
	}
	public void setCut(MaterialProperties cut) {
		this.cut = cut;
	}

	@Override
	public String toString() {
		return "Precious  Color = " + getColor() + "\nClarity = " + getClarity() + 
				"\nCut = " + getCut() + "\nPrice = " + getPrice() + "\n" + super.toString();
	}
		
}

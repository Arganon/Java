package hw.stones.entity;

import hw.stones.interfaces.MaterialProperties;

public class SemiPrecious extends Material {
	private MaterialProperties cut;
	private MaterialProperties color;
	
	public SemiPrecious() {}
	
	public SemiPrecious(double price, double weight, MaterialProperties color, 
			MaterialProperties transparency, MaterialProperties materialType, 
			MaterialProperties cut) {
		super(price, weight, transparency, materialType);
		setCut(cut);
		setColor(color);
	}
	
	public MaterialProperties getColor() {
		return color;
	}
	public void setColor(MaterialProperties color) {
		this.color = color;
	}
	public MaterialProperties getCut() {
		return cut;
	}
	public void setCut(MaterialProperties cut) {
		this.cut = cut;
	}
	@Override
	public String toString() {
		return "Semi Precious Stone\nColor = " + getColor() + "\nCut = " + getCut() + "\nPrice = " + getPrice() + "\n" + super.toString();
	}
}

package hw.stones.entity;

import hw.stones.interfaces.MaterialProperties;

public abstract class Material {
	private double price;
	private double weight;
	private MaterialProperties transparency;
	private MaterialProperties materialType;
	
	public Material() {}
	
	public Material(double price, double weight, 
			MaterialProperties transparency, MaterialProperties materialType) {
		setPrice(price);
		setWeight(weight);
		setTransparency(transparency);
		setMaterialType(materialType);
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return price * weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setVeight(int weight) {
		this.weight = weight;
	}
	public MaterialProperties getTransparency() {
		return transparency;
	}
	public void setTransparency(MaterialProperties transparency) {
		this.transparency = transparency;
	}
	public void setMaterialType(MaterialProperties type) {
		this.materialType = type;
	}
	public MaterialProperties getMaterialType() {
		return materialType;
	}
	@Override
	public String toString() {
		return "Total Price = " + getTotalPrice() + "\nWeight = "
				+ getWeight() + "\nTransparency = " + getTransparency() + "\nMaterial Type = " + getMaterialType() + "\n";
	}
}

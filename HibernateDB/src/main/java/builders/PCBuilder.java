package builders;

import entity.PC;

public class PCBuilder {
	private String maker;
	private String code;
	private String model;
	private float speed;
	private int ram;
	private float hd;
	private int cd;
	private float price;
	private PC pc;
	
	public PCBuilder(String maker, String code, String model, float speed, int ram, float hd,
			int cd, float price) {
		pc = new PC();
		this.maker = maker;
		this.code = code;
		this.model = model;
		this.speed = speed;
		this.ram = ram;
		this.hd = hd;
		this.cd = cd;
		this.price = price;
	}
	
	private void setMaker() {
		pc.setMaker(maker);
	}
	
	private void setCode() {
		pc.setCode(code);
	}
	
	private void setModel() {
		pc.setModel(model);
	}
	
	private void setSpeed() {
		pc.setSpeed(speed);
	}
	
	private void setRam() {
		pc.setRam(ram);
	}
	
	private void setHd() {
		pc.setHd(hd);
	}
	
	private void setCd() {
		pc.setCd(cd);
	}
	
	private void setPrice() {
		pc.setPrice(price);
	}
}

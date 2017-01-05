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
		this.pc = new PC();
		this.maker = maker;
		this.code = code;
		this.model = model;
		this.speed = speed;
		this.ram = ram;
		this.hd = hd;
		this.cd = cd;
		this.price = price;
	}
	
	public void setMaker() {
		pc.setMaker(maker);
	}
	
	public void setCode() {
		pc.setCode(code);
	}
	
	public void setModel() {
		pc.setModel(model);
	}
	
	public void setSpeed() {
		pc.setSpeed(speed);
	}
	
	public void setRam() {
		pc.setRam(ram);
	}
	
	public void setHd() {
		pc.setHd(hd);
	}
	
	public void setCd() {
		pc.setCd(cd);
	}
	
	public void setPrice() {
		pc.setPrice(price);
	}
	
	public void setType() {
		pc.setType();
	}
}

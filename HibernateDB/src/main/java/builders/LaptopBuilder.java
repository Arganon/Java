package builders;

import entity.Laptop;

public class LaptopBuilder {
	private String maker;
	private String code;
	private String model;
	private float speed;
	private int ram;
	private float hd;
	private float screen;
	private float price;
	private Laptop laptop;
	
	public LaptopBuilder(String maker, String code, String model, float speed, int ram, float hd, float screen,
			float price) {
		this.laptop = new Laptop();
		this.maker = maker;
		this.code = code;
		this.model = model;
		this.speed = speed;
		this.ram = ram;
		this.hd = hd;
		this.screen = screen;
		this.price = price;
	}
	public void setMaker() {
		laptop.setMaker(maker);
	}
	
	public void setCode() {
		laptop.setCode(code);
	}
	
	public void setModel() {
		laptop.setModel(model);
	}
	
	public void setSpeed() {
		laptop.setSpeed(speed);
	}
	
	public void setRam() {
		laptop.setRam(ram);
	}
	
	public void setHd() {
		laptop.setHd(hd);
	}
	
	public void setScreen() {
		laptop.setScreen(screen);
	}
	
	public void setPrice() {
		laptop.setPrice(price);
	}
	
	public void setType() {
		laptop.setType();
	}
}

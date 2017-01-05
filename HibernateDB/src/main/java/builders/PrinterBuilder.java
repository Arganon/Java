package builders;

import entity.Printer;

public class PrinterBuilder {
	private String maker;
	private String code;
	private String model;
	private String color;
	private String printingType;
	private float price;
	private Printer printer;
	
	public PrinterBuilder(String maker, String code, String model, String color, String printingType, float price) {
		this.printer = new Printer();
		this.maker = maker;
		this.code = code;
		this.model = model;
		this.color = color;
		this.printingType = printingType;
		this.price = price;
	}
	
	public void setMaker() {
		printer.setMaker(maker);
	}
	
	public void setCode() {
		printer.setCode(code);
	}
	
	public void setModel() {
		printer.setModel(model);
	}
	
	public void setColor() {
		printer.setColor(color);
	}
	
	public void setPrintingType() {
		printer.setPrintingType(printingType);
	}
	
	public void setPrice() {
		printer.setPrice(price);
	}
	
	public void setType() {
		printer.setType();
	}
}

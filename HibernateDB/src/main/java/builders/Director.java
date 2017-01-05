package builders;

public class Director {
	public Director() {}
	
	public void build(PCBuilder pcBuilder) {
		pcBuilder.setMaker();
		pcBuilder.setCode();
		pcBuilder.setModel();
		pcBuilder.setSpeed();
		pcBuilder.setRam();
		pcBuilder.setHd();
		pcBuilder.setCd();
		pcBuilder.setPrice();
		pcBuilder.setType();
	}
	
	public void build(LaptopBuilder lpBuilder) {
		lpBuilder.setMaker();
		lpBuilder.setCode();
		lpBuilder.setModel();
		lpBuilder.setSpeed();
		lpBuilder.setRam();
		lpBuilder.setHd();
		lpBuilder.setScreen();
		lpBuilder.setPrice();
		lpBuilder.setType();
	}
	
	public void build(PrinterBuilder printerBuilder) {
		printerBuilder.setMaker();
		printerBuilder.setCode();
		printerBuilder.setModel();
		printerBuilder.setColor();
		printerBuilder.setPrintingType();
		printerBuilder.setPrice();
		printerBuilder.setType();
	}
}

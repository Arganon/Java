package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "printer")
public class Printer extends Unit implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String code;
	
	private String color;
	
	private String printingType;
	
	@Column(name = "price")
	private float price;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional=true, cascade = CascadeType.ALL)
//	private Product product;

	public Printer() {}
	
	public Printer(String maker, String model, String type, 
			String code, String color, String printingType, float price) {
		super(maker, model, type);
		this.code = code;
		this.color = color;
		this.printingType = printingType;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrintingType() {
		return printingType;
	}

	public void setPrintingType(String printingType) {
		this.printingType = printingType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

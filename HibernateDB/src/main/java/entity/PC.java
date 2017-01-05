package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pc")
public class PC {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "speed")
	private float speed;
	
	@Column(name = "ram")
	private int ram;
	
	@Column(name = "hd")
	private float hd;
	
	@Column(name = "cd")
	private int cd;
	
	@Column(name = "price")
	private float price;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Product product;
	
	private String maker;
	
	//need connect with Product table
	private String type = "pc";

	public PC() {
		product = new Product();
	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		product.setMaker(maker);
		this.maker = maker;
	}

	public String getType() {
		return type;
	}

	public void setType() {
		product.setType(type);
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		product.setModel(model);
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public float getHd() {
		return hd;
	}

	public void setHd(float hd) {
		this.hd = hd;
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

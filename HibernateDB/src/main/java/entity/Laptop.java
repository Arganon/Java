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
@Table(name = "laptop")
public class Laptop {

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
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "screen")
	private float screen;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Product product;
	
	private String maker;
	
	private String type = "laptop";

	public Laptop() {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getScreen() {
		return screen;
	}

	public void setScreen(float screen) {
		this.screen = screen;
	}
}

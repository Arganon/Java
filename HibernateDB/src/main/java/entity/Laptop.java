package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop extends Unit implements Serializable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
	@Column(name = "code")
	private String code;
	
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
	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private Product product;

	public Laptop() {}

	public Laptop(String maker, String model, String type, 
			String code, float speed, int ram, float hd,
			float price, float screen) {
		super(maker, model, type);
		this.code = code;
		this.speed = speed;
		this.ram = ram;
		this.hd = hd;
		this.price = price;
		this.screen = screen;
	}
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

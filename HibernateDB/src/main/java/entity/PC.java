package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pc")
public class PC extends Unit implements Serializable {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	
	@Column(name = "code")
	private String code;
	
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
	
//	@ManyToOne(fetch = FetchType.LAZY, optional=true, cascade = CascadeType.ALL)
//	private Product product;
	
	//need connect with Product table
	public PC() {}
	
	public PC(String maker, String model, String type, 
			String code, float speed, int ram, float hd,
			int cd, float price) {
		super(maker, model, type);
		this.code = code;
		this.speed = speed;
		this.ram = ram;
		this.hd = hd;
		this.cd = cd;
		this.price = price;
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

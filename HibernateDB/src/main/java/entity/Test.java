package entity;

import entity.Product;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test extends Unit implements Serializable {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	
	private String test;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true, cascade = CascadeType.ALL)
//	@JoinTable(name = "CATALOG", joinColumns = @JoinColumn(name = "id_test"), inverseJoinColumns = @JoinColumn(name = "id_product"))
	private Product product;

	public Test() {}
	
	public Test(String maker, String model, String type, String test) {
		super(maker, model, type);
		this.test = test;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}

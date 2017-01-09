package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unit")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Unit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	protected String maker;
	
	protected String model;
	
	protected String type;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=true, cascade = CascadeType.ALL)
//	@JoinTable(name = "CATALOG", joinColumns = @JoinColumn(name = "id_test"), inverseJoinColumns = @JoinColumn(name = "id_product"))
	private Product product;

	protected Unit() {}
	
	protected Unit(String maker, String model, String type) {
		this.maker = maker;
		this.model = model;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

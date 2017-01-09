package entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "maker")
	private String maker;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "type")
	private String type;
	
	@OneToMany(orphanRemoval = true, mappedBy = "product", cascade = CascadeType.ALL)
	private Set<Unit> tests;
	

	public Set<Unit> getTests() {
		return tests;
	}

	public void setTests(Set<Unit> tests) {
		this.tests = tests;
		for(Unit t : tests) {
			setMaker(t.getMaker());
			setModel(t.getModel());
			setType(t.getType());
		}
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

package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Avion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column 
	private  String numero;
	
	@ManyToOne
	@JoinColumn(name="id_specification_avion")
	private SpecificiteAvion specificationAvion;

	public Integer getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public SpecificiteAvion getSpecificationAvion() {
		return specificationAvion;
	}

	public void setSpecificationAvion(SpecificiteAvion specificationAvion) {
		this.specificationAvion = specificationAvion;
	}
	
	
	
}

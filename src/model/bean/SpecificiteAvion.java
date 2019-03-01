package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="specifite_avion")
@Entity
public class SpecificiteAvion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String marque;
	
	@Column
	private String type;
	
	@Column
	private int nbrPassageMax;
	
	@Column
	private int volumeReservoir;
	
	@Column
	private float consoMoyenne;
	
	@Column
	private float surconsomation;

	
	
	public SpecificiteAvion() {
	}

	public Integer getId() {
		return id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNbrPassageMax() {
		return nbrPassageMax;
	}

	public void setNbrPassageMax(int nbrPassageMax) {
		this.nbrPassageMax = nbrPassageMax;
	}

	public int getVolumeReservoir() {
		return volumeReservoir;
	}

	public void setVolumeReservoir(int volumeReservoir) {
		this.volumeReservoir = volumeReservoir;
	}

	public float getConsoMoyenne() {
		return consoMoyenne;
	}

	public void setConsoMoyenne(float consoMoyenne) {
		this.consoMoyenne = consoMoyenne;
	}

	public float getSurconsomation() {
		return surconsomation;
	}

	public void setSurconsomation(float surconsomation) {
		this.surconsomation = surconsomation;
	}
	
	
	
	
	
}

package model.bean;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Table
@Entity
public class Vol {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_vol;
	
	@Column(name="num_vol")
	private String numVol;
	
	@Column(name="ville_dep")
	private String villeDeDepart;
	
	@Column(name="ville_arri")
	private String villeDArrive;
	
	@Column
	private LocalDateTime arrive;
	
	@Column
	private LocalDateTime depart;
	
	@Column(name="distance_vol")
	private float distanceVol;
	
	@ManyToOne
	@JoinColumn(name="id_avion")
	private Avion avion;
	
	@ManyToMany
	@JoinTable(name="vol_pasager", 
		joinColumns= @JoinColumn(name="id_vol", referencedColumnName="id_vol"),
		inverseJoinColumns= @JoinColumn(name="id_passager", referencedColumnName="id")
		)
	private List<Passager> passagers;
	
	@ManyToMany
	@JoinTable(name="vol_personnel_navigant", 
		joinColumns= @JoinColumn(name="id_vol", referencedColumnName="id_vol"),
		inverseJoinColumns= @JoinColumn(name="id_navigant", referencedColumnName="id")
		)
	private List<Navigant> navigants;
	
	@ManyToMany
	@JoinTable(name="vol_personnel_Non_navigant", 
		joinColumns= @JoinColumn(name="id_vol", referencedColumnName="id_vol"),
		inverseJoinColumns= @JoinColumn(name="id_non_navigant", referencedColumnName="id")
		)
	private List<NonNavigant> nonNavigants;
	
	
}

package model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Navigant extends Personnel {
	
	@ManyToOne
	@JoinColumn(name="id_type_personnel", nullable = true)
	private TypePersonel typePersonnel;
	
	@OneToMany(mappedBy = "personne" )
	private List<VolNavigant> volNavigants;
	
	
}

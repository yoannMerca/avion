package model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="non_navigant")
@Entity
public class NonNavigant extends Personnel {
	
	@ManyToOne
	@JoinColumn(name="id_type_personnel", nullable = true)
	private TypePersonel typePersonnel;
	
	@ManyToMany(mappedBy="nonNavigants")
	private List<Vol> vols;
}

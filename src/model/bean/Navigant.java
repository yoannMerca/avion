package model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Navigant extends Personnel {
	
	@ManyToMany(mappedBy="navigants")
	private List<Vol> vols;
	
	
}

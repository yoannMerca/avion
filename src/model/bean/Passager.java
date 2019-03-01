package model.bean;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Table
@Entity
public class Passager extends Personne{
	
/*	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_passager;*/
	
	@Column
	private String nationalite;
	
	@ManyToMany(mappedBy="passagers")
	private List<Vol> vols;

	
	
	
}

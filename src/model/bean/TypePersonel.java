package model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="type_personnel")
@Entity
public class TypePersonel extends Personnel {

	@Column(name="nom")
	private String type;
	
	@OneToMany(mappedBy = "typePersonnel")
	private List<NonNavigant> nonNavigants = new ArrayList<>();
	
	@OneToMany(mappedBy = "typePersonnel")
	private List<Navigant> navigants = new ArrayList<>();
}

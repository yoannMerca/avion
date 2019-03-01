package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name="type_personnel")
@Entity
public class TypePersonel extends Personnel {

	@Column(name="nom")
	private String type;
	
}

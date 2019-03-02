package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Personnel extends Personne {
	
/*	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_personnel;
	*/
	@Column
	private float salaire;
}

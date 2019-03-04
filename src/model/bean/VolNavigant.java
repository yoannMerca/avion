package model.bean;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "vol_personnel_navigant")
public class VolNavigant {

	@EmbeddedId
	 private VolNavigantId id;
		
		 @ManyToOne
		 @MapsId("volId")
		 private Vol vol;
		 
		 @ManyToOne
		 @MapsId("navigantId")
		 private Personne personne;
		 
		 @Column
		 private float prime;
}

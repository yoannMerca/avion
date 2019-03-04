package model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VolNavigantId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "vol_id")
	private int volId;

	@Column(name = "navigant_id")
	private int navigantId;

	public VolNavigantId() {
	}

	public VolNavigantId(int vol_id, int navigant_id) {
		this.volId = vol_id;
		this.navigantId = navigant_id;
	}

}

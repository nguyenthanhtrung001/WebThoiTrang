package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CtdkmId generated by hbm2java
 */
@Embeddable
public class CtdkmId implements java.io.Serializable {

	private int madkm;
	private int mamh;

	public CtdkmId() {
	}

	public CtdkmId(int madkm, int mamh) {
		this.madkm = madkm;
		this.mamh = mamh;
	}

	@Column(name = "MADKM", nullable = false)
	public int getMadkm() {
		return this.madkm;
	}

	public void setMadkm(int madkm) {
		this.madkm = madkm;
	}

	@Column(name = "MAMH", nullable = false)
	public int getMamh() {
		return this.mamh;
	}

	public void setMamh(int mamh) {
		this.mamh = mamh;
	}

	

}

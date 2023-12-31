package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * CtpdId generated by hbm2java
 */
@Embeddable
public class CtpdId implements java.io.Serializable {

	@Column(name = "MAPD", nullable = false)
	private int mapd;
	
	@Column(name = "MASIZE", nullable = false)
	private int masize;
	
	@Column(name = "MAMH", nullable = false)
	private int mamh;
	
	
	public CtpdId() {
		super();
	}


	public CtpdId(int mapd, int masize, int mamh) {
		super();
		this.mapd = mapd;
		this.masize = masize;
		this.mamh = mamh;
	}


	public int getMapd() {
		return mapd;
	}


	public void setMapd(int mapd) {
		this.mapd = mapd;
	}


	public int getMasize() {
		return masize;
	}


	public void setMasize(int masize) {
		this.masize = masize;
	}


	public int getMamh() {
		return mamh;
	}


	public void setMamh(int mamh) {
		this.mamh = mamh;
	}


	@Override
	public int hashCode() {
		return Objects.hash(mamh, mapd, masize);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CtpdId other = (CtpdId) obj;
		return mamh == other.mamh && mapd == other.mapd && masize == other.masize;
	}
	
	
	


	
	

}

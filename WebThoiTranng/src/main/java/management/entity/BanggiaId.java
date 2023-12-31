package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BanggiaId generated by hbm2java
 */
@Embeddable
public class BanggiaId implements java.io.Serializable {

	private int mamh;
	private int manv;
	private Date ngayapdung;

	public BanggiaId() {
	}

	

	@Column(name = "MAMH", nullable = false)
	public int getMamh() {
		return this.mamh;
	}

	

	public void setMamh(int mamh) {
		this.mamh = mamh;
	}



	@Column(name = "MANV", nullable = false)
	public int getManv() {
		return this.manv;
	}

	public void setManv(int manv) {
		this.manv = manv;
	}

	@Column(name = "NGAYAPDUNG", nullable = false, length = 10)
	public Date getNgayapdung() {
		return this.ngayapdung;
	}

	public void setNgayapdung(Date ngayapdung) {
		this.ngayapdung = ngayapdung;
	}

	
}

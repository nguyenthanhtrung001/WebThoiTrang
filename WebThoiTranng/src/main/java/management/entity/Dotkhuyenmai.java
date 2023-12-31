package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dotkhuyenmai generated by hbm2java
 */
@Entity
@Table(name = "dotkhuyenmai")
public class Dotkhuyenmai implements java.io.Serializable {

	private int madkm;
	private Nhanvien nhanvien;
	private String lydokm;
	private Date ngaybd;
	private Date ngaykt;
	private Set<Ctdkm> ctdkms = new HashSet<Ctdkm>(0);

	public Dotkhuyenmai() {
	}

	

	public Dotkhuyenmai(int madkm, Nhanvien nhanvien, String lydokm, Date ngaybd, Date ngaykt) {
		super();
		this.madkm = madkm;
		this.nhanvien = nhanvien;
		this.lydokm = lydokm;
		this.ngaybd = ngaybd;
		this.ngaykt = ngaykt;
	}



	public Dotkhuyenmai(int madkm, Nhanvien nhanvien, String lydokm, Date ngaybd, Date ngaykt, Set<Ctdkm> ctdkms) {
		super();
		this.madkm = madkm;
		this.nhanvien = nhanvien;
		this.lydokm = lydokm;
		this.ngaybd = ngaybd;
		this.ngaykt = ngaykt;
		this.ctdkms = ctdkms;
	}


	@Id

	@Column(name = "MADKM", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMadkm() {
		return this.madkm;
	}

	public void setMadkm(int madkm) {
		this.madkm = madkm;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MANV", nullable = false)
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Column(name = "LYDOKM", columnDefinition = "nvarchar(100)")
	public String getLydokm() {
		return this.lydokm;
	}

	public void setLydokm(String lydokm) {
		this.lydokm = lydokm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NGAYBD", nullable = false, length = 10)
	public Date getNgaybd() {
		return this.ngaybd;
	}

	public void setNgaybd(Date ngaybd) {
		this.ngaybd = ngaybd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NGAYKT", nullable = false, length = 10)
	public Date getNgaykt() {
		return this.ngaykt;
	}

	public void setNgaykt(Date ngaykt) {
		this.ngaykt = ngaykt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dotkhuyenmai")
	public Set<Ctdkm> getCtdkms() {
		return this.ctdkms;
	}

	public void setCtdkms(Set<Ctdkm> ctdkms) {
		this.ctdkms = ctdkms;
	}

}

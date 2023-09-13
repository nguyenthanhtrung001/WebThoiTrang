package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Dondathang generated by hbm2java
 */
@Entity
@Table(name = "dondathang")
public class Dondathang implements java.io.Serializable {

	private String maddh;
	private Nhacungcap nhacungcap;
	private Nhanvien nhanvien;
	private String ngaydat;
	private Set<Phieunhap> phieunhaps = new HashSet<Phieunhap>(0);
	private Set<Ctddh> ctddhs = new HashSet<Ctddh>(0);

	public Dondathang() {
	}

	public Dondathang(String maddh, Nhacungcap nhacungcap, Nhanvien nhanvien) {
		this.maddh = maddh;
		this.nhacungcap = nhacungcap;
		this.nhanvien = nhanvien;
	}

	public Dondathang(String maddh, Nhacungcap nhacungcap, Nhanvien nhanvien, String ngaydat, Set<Phieunhap> phieunhaps,
			Set<Ctddh> ctddhs) {
		this.maddh = maddh;
		this.nhacungcap = nhacungcap;
		this.nhanvien = nhanvien;
		this.ngaydat = ngaydat;
		this.phieunhaps = phieunhaps;
		this.ctddhs = ctddhs;
	}

	@Id

	@Column(name = "MADDH", unique = true, nullable = false, length = 10)
	public String getMaddh() {
		return this.maddh;
	}

	public void setMaddh(String maddh) {
		this.maddh = maddh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANCC", nullable = false)
	public Nhacungcap getNhacungcap() {
		return this.nhacungcap;
	}

	public void setNhacungcap(Nhacungcap nhacungcap) {
		this.nhacungcap = nhacungcap;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANV", nullable = false)
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Column(name = "NGAYDAT", length = 10)
	public String getNgaydat() {
		return this.ngaydat;
	}

	public void setNgaydat(String ngaydat) {
		this.ngaydat = ngaydat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dondathang")
	public Set<Phieunhap> getPhieunhaps() {
		return this.phieunhaps;
	}

	public void setPhieunhaps(Set<Phieunhap> phieunhaps) {
		this.phieunhaps = phieunhaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dondathang")
	public Set<Ctddh> getCtddhs() {
		return this.ctddhs;
	}

	public void setCtddhs(Set<Ctddh> ctddhs) {
		this.ctddhs = ctddhs;
	}

}

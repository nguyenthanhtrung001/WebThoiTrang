package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Phieudat generated by hbm2java
 */
@Entity
@Table(name = "phieudat")
public class Phieudat implements java.io.Serializable {

	private String mapd;
	private Khachhang khachhang;
	private Nhanvien nhanvien;
	private Date ngaydat;
	private String hotennguoinhan;
	private String diachi;
	private String sdt;
	private Date ngaygiogiao;
	private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);
	private Set<Ctpd> ctpds = new HashSet<Ctpd>(0);

	public Phieudat() {
	}

	public Phieudat(String mapd, Khachhang khachhang, Nhanvien nhanvien, String hotennguoinhan, String diachi,
			String sdt) {
		this.mapd = mapd;
		this.khachhang = khachhang;
		this.nhanvien = nhanvien;
		this.hotennguoinhan = hotennguoinhan;
		this.diachi = diachi;
		this.sdt = sdt;
	}

	public Phieudat(String mapd, Khachhang khachhang, Nhanvien nhanvien, Date ngaydat, String hotennguoinhan,
			String diachi, String sdt, Date ngaygiogiao, Set<Hoadon> hoadons, Set<Ctpd> ctpds) {
		this.mapd = mapd;
		this.khachhang = khachhang;
		this.nhanvien = nhanvien;
		this.ngaydat = ngaydat;
		this.hotennguoinhan = hotennguoinhan;
		this.diachi = diachi;
		this.sdt = sdt;
		this.ngaygiogiao = ngaygiogiao;
		this.hoadons = hoadons;
		this.ctpds = ctpds;
	}

	@Id

	@Column(name = "MAPD", unique = true, nullable = false, length = 10)
	public String getMapd() {
		return this.mapd;
	}

	public void setMapd(String mapd) {
		this.mapd = mapd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAKH", nullable = false)
	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANV", nullable = true)
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NGAYDAT", length = 19)
	public Date getNgaydat() {
		return this.ngaydat;
	}

	public void setNgaydat(Date ngaydat) {
		this.ngaydat = ngaydat;
	}

	@Column(name = "HOTENNGUOINHAN", nullable = true, columnDefinition = "nvarchar(100)")
	public String getHotennguoinhan() {
		return this.hotennguoinhan;
	}

	public void setHotennguoinhan(String hotennguoinhan) {
		this.hotennguoinhan = hotennguoinhan;
	}

	@Column(name = "DIACHI", nullable = true, columnDefinition = "nvarchar(100)")
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Column(name = "SDT", nullable = true, length = 15)
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NGAYGIOGIAO", length = 26)
	public Date getNgaygiogiao() {
		return this.ngaygiogiao;
	}

	public void setNgaygiogiao(Date ngaygiogiao) {
		this.ngaygiogiao = ngaygiogiao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phieudat")
	public Set<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phieudat")
	public Set<Ctpd> getCtpds() {
		return this.ctpds;
	}

	public void setCtpds(Set<Ctpd> ctpds) {
		this.ctpds = ctpds;
	}

}

package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Quyen generated by hbm2java
 */
@Entity
@Table(name = "quyen")
public class Quyen implements java.io.Serializable {

	private int maquyen;
	private String tenquyen;
	private Set<Taikhoan> taikhoans = new HashSet<Taikhoan>(0);

	public Quyen() {
	}

	public Quyen(int maquyen, String tenquyen) {
		this.maquyen = maquyen;
		this.tenquyen = tenquyen;
	}

	public Quyen(int maquyen, String tenquyen, Set<Taikhoan> taikhoans) {
		this.maquyen = maquyen;
		this.tenquyen = tenquyen;
		this.taikhoans = taikhoans;
	}

	@Id

	@Column(name = "MAQUYEN", unique = true, nullable = false)
	public int getMaquyen() {
		return this.maquyen;
	}

	public void setMaquyen(int maquyen) {
		this.maquyen = maquyen;
	}

	@Column(name = "TENQUYEN", nullable = false, length = 20)
	public String getTenquyen() {
		return this.tenquyen;
	}

	public void setTenquyen(String tenquyen) {
		this.tenquyen = tenquyen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quyen")
	public Set<Taikhoan> getTaikhoans() {
		return this.taikhoans;
	}

	public void setTaikhoans(Set<Taikhoan> taikhoans) {
		this.taikhoans = taikhoans;
	}

}

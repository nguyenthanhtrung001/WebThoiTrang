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
import javax.persistence.UniqueConstraint;

/**
 * Nhanhieu generated by hbm2java
 */
@Entity
@Table(name = "nhanhieu",  uniqueConstraints = @UniqueConstraint(columnNames = "TENNH"))
public class Nhanhieu implements java.io.Serializable {

	private String manh;
	private String tennh;
	private Set<Mathang> mathangs = new HashSet<Mathang>(0);

	public Nhanhieu() {
	}

	public Nhanhieu(String manh, String tennh) {
		this.manh = manh;
		this.tennh = tennh;
	}

	public Nhanhieu(String manh, String tennh, Set<Mathang> mathangs) {
		this.manh = manh;
		this.tennh = tennh;
		this.mathangs = mathangs;
	}

	@Id

	@Column(name = "MANH", unique = true, nullable = false, length = 10)
	public String getManh() {
		return this.manh;
	}

	public void setManh(String manh) {
		this.manh = manh;
	}

	@Column(name = "TENNH", unique = true, nullable = false, length = 100)
	public String getTennh() {
		return this.tennh;
	}

	public void setTennh(String tennh) {
		this.tennh = tennh;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanhieu")
	public Set<Mathang> getMathangs() {
		return this.mathangs;
	}

	public void setMathangs(Set<Mathang> mathangs) {
		this.mathangs = mathangs;
	}

}

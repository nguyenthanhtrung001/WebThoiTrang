package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Hinhanhmh generated by hbm2java
 */
@Entity
@Table(name = "hinhanhmh")
public class Hinhanhmh implements java.io.Serializable {

	private int maha;
	private Mathang mathang;
	private String duongdan;

	public Hinhanhmh() {
	}

	public Hinhanhmh(int maha, Mathang mathang) {
		this.maha = maha;
		this.mathang = mathang;
	}

	public Hinhanhmh(int maha, Mathang mathang, String duongdan) {
		this.maha = maha;
		this.mathang = mathang;
		this.duongdan = duongdan;
	}

	@Id

	@Column(name = "MAHA", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMaha() {
		return this.maha;
	}

	public void setMaha(int maha) {
		this.maha = maha;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MAMH", nullable = false)
	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	@Column(name = "DUONGDAN", columnDefinition = "varchar(500)")
	public String getDuongdan() {
		return this.duongdan;
	}

	public void setDuongdan(String duongdan) {
		this.duongdan = duongdan;
	}

}

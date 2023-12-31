package management.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Ctpd generated by hbm2java
 */
@Entity
@Table(name = "ctpd")
public class Ctpd implements java.io.Serializable {


	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "MAPD", column = @Column(name = "MAPD", nullable = false)),
        @AttributeOverride(name = "MASIZE", column = @Column(name = "MASIZE", nullable = false)),
        @AttributeOverride(name = "MAMH", column = @Column(name = "MAMH", nullable = false))
    })
    private CtpdId id;

    @Column(name = "SOLUONG", nullable = false)
    private int soluong;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAPD", referencedColumnName = "MAPD", insertable = false, updatable = false)
    private Phieudat phieudat;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
        @JoinColumn(name = "MAMH", referencedColumnName = "MAMH", insertable = false, updatable = false),
        @JoinColumn(name = "MASIZE", referencedColumnName = "MASIZE", insertable = false, updatable = false)
    }) 	
    private Ctsize ctsize;

	public Ctpd() {
		super();
	}

	public Ctpd(CtpdId id, int soluong, Ctsize ctsize, Phieudat phieudat) {
		super();
		this.id = id;
		this.soluong = soluong;
		this.ctsize = ctsize;
		this.phieudat = phieudat;
	}

	// Các thuộc tính và phương thức getter/setter
    public CtpdId getId() {
        return id;
    }

    public void setId(CtpdId id) {
        this.id = id;
    }

    public Ctsize getCtsize() {
        return ctsize;
    }

    public void setCtsize(Ctsize ctsize) {
        this.ctsize = ctsize;
    }

    public Phieudat getPhieudat() {
        return phieudat;
    }

    public void setPhieudat(Phieudat phieudat) {
        this.phieudat = phieudat;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
	

}

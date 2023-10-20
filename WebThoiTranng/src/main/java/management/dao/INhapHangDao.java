package management.dao;

import java.util.List;

import management.entity.Ctpn;
import management.entity.Ctsize;
import management.entity.Mathang;
import management.entity.Nhacungcap;
import management.entity.Nhanvien;
import management.entity.Phieunhap;
import management.entity.Size;

public interface INhapHangDao{
	
	public List<Mathang> layDSMatHang();
	
	public Mathang layMatHang(int mamh) ;
	
	public Size laySize(int masize) ;
	
	public Ctsize layCtsize(int mamh, int masize);
	
	public List<Size> layDSSize();
	
	public void themCtSize(int manh,int masize) ;

	public List<Nhacungcap> layDSNhaCungCap();
	
	public Nhacungcap layNCC(int maNCC);
	
	public void themPhieuNhap(Phieunhap pn, List<Ctpn> ctpns);
	
	public Nhanvien layNhanVien(int manv);
	
	public void themPhieuNhap(Phieunhap pn);
	
	public void themSLTuPN(Ctsize ctsize, int sl);
	
	public void themCtpn(List<Ctpn> ctpns);
	
	
	
	
	
	
}
package sourcecode.bai01;

//Lớp con cho chuyến xe nội thành
public class ChuyenXeNoiThanh extends ChuyenXe {
	 private int soTuyen;
	 private double soKmDiDuoc;
	
	 public ChuyenXeNoiThanh(String maSo, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKmDiDuoc) {
	     super(maSo, hoTenTaiXe, soXe, doanhThu);
	     setSoTuyen(soTuyen);
	     setSoKmDiDuoc(soKmDiDuoc);
	 }
	
	 
	 public int getSoTuyen() {
	     return soTuyen;
	 }
	
	 public void setSoTuyen(int soTuyen) {
	     this.soTuyen = soTuyen > 0 ? soTuyen : 0;
	 }
	
	 public double getSoKmDiDuoc() {
	     return soKmDiDuoc;
	 }
	
	 public void setSoKmDiDuoc(double soKmDiDuoc) {
	     this.soKmDiDuoc = soKmDiDuoc > 0 ? soKmDiDuoc : 0;
	 }
	
	
	@Override
	public String toString() {
		return super.toString() + "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKmDiDuoc=" + soKmDiDuoc + "]";
	}
	 
 
}

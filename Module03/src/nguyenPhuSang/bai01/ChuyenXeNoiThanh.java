package nguyenPhuSang.bai01;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private double soKmDiDuoc;
	
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	public void setSoKmDiDuoc(double soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}
	
	public ChuyenXeNoiThanh() {
		super();
	}
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen,
			double soKmDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen=soTuyen;
		this.soKmDiDuoc=soKmDiDuoc;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("| %-20d | %-15s", soTuyen, soKmDiDuoc);
	}
}

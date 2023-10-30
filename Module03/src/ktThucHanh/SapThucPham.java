package ktThucHanh;

import java.text.DecimalFormat;

public class SapThucPham extends Sap{

	private double phiSuDungDVTD;

	/**
	 * Constructor khai báo và gán giá trị cho các thuộc tính của đối tượng
	 * @param maSap
	 * @param dienTich
	 * @param doanhThu
	 * @param thueSap
	 * @param phiSuDungDVTD
	 */
	public SapThucPham(String maSap, double dienTich, double doanhThu, double thueSap, double phiSuDungDVTD) {
		super(maSap, dienTich, doanhThu, thueSap);
		setPhiSuDungDVTD(phiSuDungDVTD);
	}

	public double getPhiSuDungDVTD() {
		return phiSuDungDVTD;
	}

	public void setPhiSuDungDVTD(double phiSuDungDVTD) {
		this.phiSuDungDVTD = phiSuDungDVTD > 0 ? phiSuDungDVTD : 1;
	}
	
	/**
	 * Tính tiền cho người quản lí sạp của SapThucPham. Cong thuc: tien sap + 5% doanh thu + phí sử dụng DVTD
	 * @return double: giá tiền đóng cho người quản lí
	 */
	@Override
	public double tinhTienNQL() {
		return super.tinhTienSap() + (super.getDoanhThu() * (5/100)) + this.phiSuDungDVTD;
	}

	/**
	 * Lấy tiêu đề của output
	 * @return String: thông tin của output
	 */
	public static String getTitle() {
		return Sap.getTitle() + String.format("%-15s %-16s","Tien NQL", "Phi Su Dung DVDT");
	}
	
	/**
	 * Lấy thông tin của đối tượng
	 * @return String: thông tin của đối tượng
	 */
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		return super.toString() + String.format("%-15s %-16s", formatter.format(phiSuDungDVTD), formatter.format(tinhTienNQL()));
	}
}

package ktThucHanh;

import java.text.DecimalFormat;

public class SapQuanAo extends Sap{

	public SapQuanAo(String maSap, double dienTich, double doanhThu, double thueSap) {
		super(maSap, dienTich, doanhThu, thueSap);
	}

	/**
	 * Tính tiền người quản lí. Theo công thức: 
	 * <p> tien sap + 10% doanh thu (nếu doanh thu < 100.000.000)
	 * <p> tiep sap + 20% doanh thu (nếu doanh thu >= 100.000.000)
	 * @return double: tính tiền NQL
	 */
	@Override
	public double tinhTienNQL() {
		return super.getDoanhThu() < 100000000 ? 
				super.tinhTienSap() + (super.getDoanhThu() * (10/100)) :
					super.tinhTienSap() + (super.getDoanhThu() * (20/100));
	}
	
	/**
	 * Lấy thông tin của tiêu đề
	 * @return String: thông tin tiêu đề
	 */
	public static String getTitle() {
		return Sap.getTitle() + String.format(" %-15s", "Tien NQL");
	}
	
	/**
	 * Thông tin của đối tượng
	 */
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		return super.toString() + String.format(" %-15s", formatter.format(tinhTienNQL()));
	}
}

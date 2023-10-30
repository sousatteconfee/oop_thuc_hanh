package ktThucHanh;

import java.text.DecimalFormat;

public abstract class Sap {
	
	protected String maSap;
	protected double dienTich;
	protected double doanhThu;
	protected double thueSap;
	
	/**
	 * Constructor khai báo và gán giá trị cho thuộc tính của đối tượng
	 * @param maSap
	 * @param dienTich
	 * @param doanhThu
	 * @param thueSap
	 */
	public Sap(String maSap, double dienTich, double doanhThu, double thueSap) {
		this.setMaSap(maSap);
		this.setDienTich(dienTich);
		this.setDoanhThu(doanhThu);
		this.setThueSap(thueSap);
	}

	public String getMaSap() {
		return maSap;
	}

	public void setMaSap(String maSap) {
		this.maSap = maSap.trim().equals("") ? "xxx" : maSap;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich > 0 ? dienTich : 1;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu > 0 ? doanhThu : 1;
	}

	public double getThueSap() {
		return thueSap;
	}

	public void setThueSap(double thueSap) {
		this.thueSap = thueSap > 0 ? thueSap : 1;
	}
	
	public abstract double tinhTienNQL();
	
	/**
	 * Lấy tiêu đề của output
	 * @return String: tiêu đề
	 */
	public static String getTitle() {
		return String.format("%-6s %-9s %-15s %-20s", "Ma Sap", "Dien Tich", "Thue Sap", "Doanh Thu");
	}
	
	public double tinhTienSap() {
		return this.dienTich * this.thueSap;
	}
	
	/**
	 * Lấy thông tin của đối tượng
	 */
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		return String.format("%-6s %-9s %-15s %-20s", this.maSap, formatter.format(dienTich), formatter.format(thueSap), formatter.format(doanhThu));
	}
}

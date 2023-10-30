package sourcecode.bai06;

import java.text.DecimalFormat;

public abstract class HangHoa {

	DecimalFormat df = new DecimalFormat("#,##0");
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}

	public HangHoa() throws Exception {
		this("xxx", "xxx", 0, 0);
	}

	public String getMaHang() {
		return maHang;
	}

	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		} else
			throw new Exception("Lỗi: Mã Hàng không được để trống.");
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals("")) {
			this.tenHang = tenHang;
		} else
			this.maHang = "xxx";
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;
	}

	public double tinhTienVAT() {
		return 0;
	}

	public String danhGiaMucDoBuonBan() {
		return null;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15d ", this.maHang, this.tenHang, df.format(donGia), this.soLuongTon);
	}

}

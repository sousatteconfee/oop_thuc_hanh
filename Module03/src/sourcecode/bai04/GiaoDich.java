package sourcecode.bai04;

import java.time.LocalDate;

public class GiaoDich {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private int soLuong;

	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		setMaGD(maGD);
		setNgayGD(ngayGD);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}

	public GiaoDich() {
		this("xxx",LocalDate.now(),0,0);
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		if (maGD.trim().equals("") == true) {
			this.maGD = "xxx";
		} else
			this.maGD = maGD;
	}

	public LocalDate getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(LocalDate ngayGD) {
		if (ngayGD.isBefore(LocalDate.now()) == true) {
			this.ngayGD = ngayGD;
		} else
			this.ngayGD = LocalDate.now();
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong > 0)
			this.soLuong = soLuong;
		else
			this.soLuong = 0;
	}

	public double tinhThanhTien()
	{
		return this.soLuong*this.donGia;
	}
	@Override
	public String toString() {
		return "GiaoDich [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", soLuong=" + soLuong + "]";
	}
}

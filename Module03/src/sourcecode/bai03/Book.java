package sourcecode.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DecimalFormat df = new DecimalFormat("#,##0VND");
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String NXB;

	public Book(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nXB) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNXB(nXB);
	}

	public Book() {
		this("xxx", LocalDate.now(), 1, 1, "xxx");
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if (maSach.trim().equals("") == true) {
			this.maSach = "xxx";
		} else
			this.maSach = maSach;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isAfter(LocalDate.now())) {
			this.ngayNhap = LocalDate.now();
		} else
			this.ngayNhap = ngayNhap;
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

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}

	public double getThanhTien() {
		return this.soLuong * this.donGia;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15d %-15s", this.maSach, dtf.format(ngayNhap), df.format(donGia),
				this.soLuong, this.NXB);
	}

}
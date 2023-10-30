package tuan6QLSach;

import java.util.Date;

public class SachThamKhao extends Sach 
{
	private double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public SachThamKhao(String maSach, Date ngayNhap, double donGia,
			int soLuong, String nhaXB, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		this.thue = thue;
	}

	public SachThamKhao() {
		super();

	}

	public SachThamKhao(String maSach, Date ngayNhap, double donGia,
			int soLuong, String nhaXB) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);

	}
	@Override
	public String toString() {
		return super.toString() + String.format("|%-30.2s|",thue);
	}

	@Override
	double thanhTien() {
		// TODO Auto-generated method stub
		return donGia * soLuong + thue;
	}

}

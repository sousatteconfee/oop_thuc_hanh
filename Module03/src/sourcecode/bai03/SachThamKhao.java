package sourcecode.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class SachThamKhao extends Book {
	DecimalFormat df = new DecimalFormat("#,##0NVD");
	private double thue;

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nXB, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		this.thue = thue;
	}

	public SachThamKhao() {
		super("xxx", LocalDate.now(), 0, 0, "xxx");
		this.thue = 0;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if (thue >= 0)
			this.thue = thue;
		else
			this.thue = 0;
	}

	@Override
	public double getThanhTien() {
		return super.getThanhTien() + this.thue;
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		s += String.format("%-15s %-15s","-" ,this.thue);
		return s;

	}

}

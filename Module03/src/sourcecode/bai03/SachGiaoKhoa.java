package sourcecode.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachGiaoKhoa extends Book {
	DecimalFormat df = new DecimalFormat("#,##0NVD");
	private boolean tinhTrang;

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nXB, boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nXB);
		this.tinhTrang = tinhTrang;
	}

	public SachGiaoKhoa() {
		super("xxx", LocalDate.now(), 0, 0, "xxx");
		this.tinhTrang = true;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double getThanhTien() {
		if (this.tinhTrang == true) {
			return super.getThanhTien();
		} else {
			return super.getThanhTien() * 0.5;
		}
	}

	@Override
	public String toString() {
		String s = "";
		s += super.toString();
		if (tinhTrang == true) {
			s += String.format("%-15s", "Mới");
		}
		else
			s += String.format("%-15s", "Cũ");
		s+= String.format(" %-15s","-" );
		return s;

	}

}
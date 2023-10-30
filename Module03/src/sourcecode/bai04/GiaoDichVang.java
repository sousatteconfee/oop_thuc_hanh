package sourcecode.bai04;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	public GiaoDichVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		setLoaiVang(loaiVang);
	}

	public GiaoDichVang() {
		super("xxx", LocalDate.now(), 0, 0);
		this.loaiVang = "chua xac dinh";
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		if (loaiVang.trim().equals("") == true) {
			this.loaiVang = "chua xac dinh.";
		} else
			this.loaiVang = loaiVang;

	}

	@Override
	public double tinhThanhTien() {
		return super.tinhThanhTien();
	}

	@Override
	public String toString() {
		String s= "";
		s+= super.toString();
		s+=		"GiaoDichVang [loaiVang=" + loaiVang + "]";
		return s;
	}
}

package sourcecode.bai04;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private LoaiTienTe loaiTienTe;

	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia,
			LoaiTienTe loaiTienTe) {
		super(maGD, ngayGD, donGia, soLuong);
		setTiGia(tiGia);
		this.loaiTienTe = loaiTienTe;
	}

	public GiaoDichTienTe() {
		super("xxx",LocalDate.now(),0,0);
		this.tiGia = 0;
		this.loaiTienTe = LoaiTienTe.VND;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		if (tiGia > 0)
			this.tiGia = tiGia;
		else
			this.tiGia = 0;
	}

	public LoaiTienTe getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(LoaiTienTe loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	@Override
	public double tinhThanhTien()
	{
		if(this.loaiTienTe == LoaiTienTe.Euro || this.loaiTienTe == LoaiTienTe.USD )
		{
			return super.getSoLuong()*super.getDonGia()*this.tiGia;
		}
		else
			return super.tinhThanhTien();
	}
	
	@Override
	public String toString() {
		String s= "";
		s+= super.toString();
		s+=		"GiaoDichTienTe [tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + "]";
		return s;
	}
}

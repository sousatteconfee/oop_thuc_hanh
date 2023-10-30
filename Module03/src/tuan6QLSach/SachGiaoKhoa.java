package tuan6QLSach;

import java.util.Date;

public class SachGiaoKhoa extends Sach 
{
	public boolean tinhTrang;

public boolean isTinhTrang()
{
	return tinhTrang;
}

public void setTinhTrang(boolean tinhTrang) {
	this.tinhTrang = tinhTrang;
}

public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong,
		String nhaXB, boolean tinhTrang) {
	super(maSach, ngayNhap, donGia, soLuong, nhaXB);
	this.tinhTrang = tinhTrang;
}

public SachGiaoKhoa() {
	super();
}

public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong,
		String nhaXB) {
	super(maSach, ngayNhap, donGia, soLuong, nhaXB);

}

@Override
public String toString() {
	String s="";
	if(isTinhTrang()==true) {
		s="Mới";
	}else {
		s="Cũ";
	}

		return super.toString() + String.format("|%-30s|",tinhTrang);
}

@Override
double thanhTien() {
	if(this.tinhTrang==true) {
		return this.donGia * this.soLuong;
	}
	
	return this.donGia * this.soLuong * 0.5;
}


	
}





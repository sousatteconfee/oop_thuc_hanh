package tuan6QLSach;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Sach {

	protected String maSach;
	protected Date ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected static String nhaXB;


	public Sach(String maSach, Date ngayNhap, double donGia, int soLuong,
			String nhaXB) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXB = nhaXB;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) throws Exception {
		if(maSach == "")
			throw new Exception("Mã không được rỗng");
		else
			this.maSach = maSach;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}

	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSach == null) ? 0 : maSach.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		if (maSach == null) {
			if (other.maSach != null)
				return false;
		} else if (!maSach.equals(other.maSach))
			return false;
		return true;
	}
	
abstract double thanhTien();
	
	//Khởi tạo phương thức để nhập ngày xuất bản
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		String day = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(day);
		String ngay =  df.format(getNgayNhap());
		s+=String.format("%-10s %-20s %5d %10.2f %15s %15.2f",getMaSach(),getNhaXB(),getSoLuong(),getDonGia(),ngay+" ",thanhTien());
		return s;
	}

	





}

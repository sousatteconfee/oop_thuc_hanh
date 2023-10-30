package bai04;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private double diemLyThuyet;
	private double diemThucHanh;
	
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV > 0)
			this.maSV=maSV;
		else 
			this.maSV=0;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(hoTen.length()==0 || hoTen.equals(""))
			hoTen="0";
		this.hoTen = hoTen;
	}
	public double getDiemLyThuyet() {
		return diemLyThuyet;
	}
	public void setDiemLyThuyet(double diemLyThuyet) {
		if(diemLyThuyet >= 0 && diemLyThuyet <= 10)
			this.diemLyThuyet=diemLyThuyet;
		else
			this.diemLyThuyet=0;
	}
	public double getDiemThucHanh() {
		return diemThucHanh;
	}
	public void setDiemThucHanh(double diemThucHanh) {
		if(diemThucHanh >= 0 && diemThucHanh <= 10)
			this.diemThucHanh=diemThucHanh;
		else
			this.diemThucHanh=0;
	}
	public DiemSinhVien() {
		this.maSV=21023391;
		this.hoTen="Nguyen Phu Sang";
		this.diemLyThuyet=8;
		this.diemThucHanh=6;
	}
	public DiemSinhVien(int maSV, String hoTen, double diemLyThuyet, double diemThucHanh) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLyThuyet(diemLyThuyet);
		setDiemThucHanh(diemThucHanh);
	}
	public double tinhDiemTrungBinh() {
		return (this.diemLyThuyet+this.diemThucHanh) / 2;
	}
	public static String inTieuDe() {
		return String.format("%-10s %-20s %-10s %-10s %-10s", "MaSV", "HoTen", "DiemLT", "DiemTH", "DiemTB");
	}
	@Override
	public String toString() {
		return String.format("%-10s %-20s %-10s %-10s %-10s", maSV, hoTen, diemLyThuyet, diemThucHanh, tinhDiemTrungBinh());
	}
}

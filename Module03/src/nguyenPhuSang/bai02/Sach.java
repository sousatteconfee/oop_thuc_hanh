package nguyenPhuSang.bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
    private String maSach;
    private LocalDate ngayNhap;
    private double donGia;
    private int soLuong;
    private String nxb;

    /**
     * constructor
     */
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        if (maSach.equals("") || maSach.length() == 0)
            maSach = "Chưa Xác Định";
        this.maSach = maSach;
    }

    /**
     * get/set
     */
    public LocalDate getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(LocalDate ngayNhap) {
        if (ngayNhap.isAfter(LocalDate.now()))
            ngayNhap = LocalDate.now();
        this.ngayNhap = ngayNhap;
    }

    /**
     * method
     */
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        if (donGia < 0)
            donGia = 0;
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong < 0)
            soLuong = 1;
        this.soLuong = soLuong;
    }
    public String getNxb() {
        return nxb;
    }
    public void setNxb(String nxb) {
        if (nxb.equals("") || nxb.length() == 0)
            nxb = "Chưa Xác Định";
        this.nxb = nxb;
    }
    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nxb) {
        setMaSach(maSach);
        setNgayNhap(ngayNhap);
        setDonGia(donGia);
        setSoLuong(soLuong);
        setNxb(nxb);
    }
    public double tinhTien() {
        return soLuong * donGia;
    }
    public Sach() {
        this("Chưa xác định", LocalDate.now(), 0, 0, "Chưa xác định");
    }
    public static String getTieuDe() {
    	return String.format("%-20s | %-15s | %-10.2f | %-10d | %-20s | %-15s",
    			"Ma Sach", "Ngay Nhap", "Don Gia", "So Luong", "NXB", "Thanh Tien");
    }
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s | %-15s | %-10.2f | %-10d | %-20s", maSach, dtf.format(ngayNhap), donGia, soLuong, nxb);
    }

}
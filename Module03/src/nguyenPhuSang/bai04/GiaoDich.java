package nguyenPhuSang.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
    protected String maGD;
    protected LocalDate ngayGD;
    protected double donGia;
    protected int soLuong;

    /**
     * get/set
     */
    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        if (maGD.length() == 0 || maGD.equals(""))
            maGD = "Chưa xác định";
        this.maGD = maGD;
    }
    public LocalDate getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(LocalDate ngayGD) {
        if (ngayGD.isBefore(LocalDate.now()))
            ngayGD = LocalDate.now();
        this.ngayGD = ngayGD;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        if(donGia < 0)
            donGia = 0;
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if(soLuong < 0)
            soLuong = 0;
        this.soLuong = soLuong;
    }

    /**
     * constructor
     */
    public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
        setMaGD(maGD);
        setNgayGD(ngayGD);
        setDonGia(donGia);
        setSoLuong(soLuong);
    }
    public GiaoDich() {
        this("Chưa xác định", LocalDate.now(), 0, 0);
    }
    /**
     * method
     */
    public double tinhTien() {
        return soLuong * donGia;
    }
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%-10s | %-20s | %-20s | %-15d", maGD, dtf.format(ngayGD), df.format(donGia), soLuong);
    }
}

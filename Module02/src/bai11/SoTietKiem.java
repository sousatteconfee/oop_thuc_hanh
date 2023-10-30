package bai11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
    private String maSo;
    private LocalDate ngayMoSo;
    private double soTienGoi;
    private int kyHan;
    private float laiSuat;
    private int soThangGoi;

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public LocalDate getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(LocalDate ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public void setSoThangGoi(int soThangGoi) {
        this.soThangGoi = soThangGoi;
    }

    public int getSoThangGoi() {
        return soThangGoi;
    }

    public double getSoTienGoi() {
        return soTienGoi;
    }

    public void setSoTienGoi(double soTienGoi) {
        this.soTienGoi = soTienGoi;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }

    public SoTietKiem(String maSo, LocalDate ngayMoSo, int soThangGoi, double soTienGoi, int kyHan, float laiSuat) {
        this.maSo = maSo;
        this.ngayMoSo = ngayMoSo;
        this.soThangGoi = soThangGoi;
        this.soTienGoi = soTienGoi;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }

    public int tinhSoThangGoiThuc() {
        LocalDate hienTai = LocalDate.now();
        Period chechLech = Period.between(ngayMoSo, hienTai);
        int result = 0;
        if (ngayMoSo.isBefore(LocalDate.now()))
            result = chechLech.getMonths();
        else if (ngayMoSo.isAfter(LocalDate.now()))
            result = kyHan;
        return result;
    }

    public double tinhTienLai() {
        return soTienGoi * laiSuat * tinhSoThangGoiThuc();
    }

    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%s - ngày mở %10s Kỳ hạn %d tháng, lãi suất %.3f - Số tháng gởi: %d; Tiền lãi: %s", 
        maSo, dtf.format(ngayMoSo), kyHan, laiSuat, getSoThangGoi(), df.format(tinhTienLai()));
    }
}
package nguyenPhuSang.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

// package Module3.Bai3;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    /**
     * get/set
     */
    public String getLoaiVang() {
        return loaiVang;
    }
    public void setLoaiVang(String loaiVang) {
        if(loaiVang.length() == 0 || loaiVang.equals(""))
            loaiVang = "Chưa xác định";
        this.loaiVang = loaiVang;
    }

    /**
     * constructor
     */
    public GiaoDichVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
        super(maGD, ngayGD, donGia, soLuong);
        setLoaiVang(loaiVang);
    }
    /**
     * method
     */
    @Override
    public double tinhTien() {
        return super.tinhTien();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return super.toString() + String.format("| %-20s | %-20s", loaiVang, df.format(tinhTien()));
    }
}

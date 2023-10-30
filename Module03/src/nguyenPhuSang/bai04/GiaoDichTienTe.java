package nguyenPhuSang.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
    private double tiGia;
    private String loaiTien;

    /**
     * constructor
     */
    public double getTiGia() {
        return tiGia;
    }
    public void setTiGia(double tiGia) {
        if(tiGia < 0)
            tiGia = 0;
        this.tiGia = tiGia;
    }

    /**
     * get/set
     */
    public String getLoaiTien() {
        return loaiTien;
    }
    public void setLoaiTien(String loaiTien) {
        if(loaiTien.equalsIgnoreCase("VND") || loaiTien.equalsIgnoreCase("USD") || loaiTien.equalsIgnoreCase("EURO"))
            this.loaiTien = loaiTien;
        else
            this.loaiTien = "VND";
    }
	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia, String loaiTien) {
		super(maGD, ngayGD, donGia, soLuong);
        setTiGia(tiGia);
        setLoaiTien(loaiTien);
	}
	/**
	 * method
	 */
    public double tinhTien() {
        double tien = 0;
        if(loaiTien.equalsIgnoreCase("VND"))
            tien = getDonGia() * getSoLuong();
        else
            tien = getDonGia() * getSoLuong() * tiGia;
        return tien;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return super.toString() + String.format("| %-20s | %-20s", loaiTien, df.format(tinhTien()));
    }
}

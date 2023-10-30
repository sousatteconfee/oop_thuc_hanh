package nguyenPhuSang.bai02;

import java.time.LocalDate; 

public class SachGiaoKhoa extends Sach{
    private String tinhTrang;

    /**
     * @return String return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        if(tinhTrang.equalsIgnoreCase("moi") || tinhTrang.equalsIgnoreCase("cu"))
            this.tinhTrang = tinhTrang;
        else
            this.tinhTrang = "moi";
    }

    /**
     * @param maSach
     * @param ngayNhap
     * @param donGia
     * @param soLuong
     * @param nxb
     * @param tinhTrang
     */
    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nxb, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nxb);
        setTinhTrang(tinhTrang);
    }

    /**
     * 
     * 
     */
    public SachGiaoKhoa() {
        this("", LocalDate.now(), 0, 0, "", "");
    }

    @Override
    public double tinhTien() {
        double tien = 0;
        if(tinhTrang.equalsIgnoreCase("moi"))
            tien = getSoLuong() * getDonGia();
        else
            tien = getSoLuong() * getDonGia() * 0.5;
        return tien;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("| %-10s | %-20.2f", tinhTrang, tinhTien());
    }
}

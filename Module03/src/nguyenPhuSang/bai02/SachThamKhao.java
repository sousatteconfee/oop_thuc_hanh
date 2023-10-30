package nguyenPhuSang.bai02;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
    private double thue;

    /**
     * get/set
     */
    public double getThue() {
        return thue;
    }
    public void setThue(double thue) {
        if(thue < 0)
            thue = 0;
        this.thue = thue;
    }

    /**
     * contructor
     */
    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nxb, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nxb);
        setThue(thue);
    }
    public SachThamKhao() {
        this("", LocalDate.now(), 0, 0, "", 0);
    }

    @Override
    public double tinhTien() {
        return getSoLuong() * getDonGia() + thue;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("| %-10.2f | %-20.2f", thue, tinhTien());
    }
}

package bai11;

import java.time.LocalDate;

public class KhachHang {
	private String maKH;
    private String hotenKH;
    private SoTietKiem[] dsSoTietKiem;
    private int soLuongSo;
    private int count = 0;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public SoTietKiem[] getDsSoTietKiem() {
        return dsSoTietKiem;
    }

    public void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
        this.dsSoTietKiem = dsSoTietKiem;
    }

    public int getSoLuongSo() {
        return soLuongSo;
    }

    public void setSoLuongSo(int soLuongSo) {
        this.soLuongSo = soLuongSo;
    }

    public KhachHang(String maKH, String hotenKH, int soLuongSo) {
        this.maKH = maKH;
        this.hotenKH = hotenKH;
        this.soLuongSo = soLuongSo;
        dsSoTietKiem = new SoTietKiem[soLuongSo];
    }

	public boolean themSoTietKiem(String maSo,
			LocalDate ngayMoSo, int soThangGoi, double soTienGoi, int kyHan,
            float laiSuat) {
        if (maSo.equals("") || maSo.isEmpty() || soTienGoi <= 0 || kyHan < 1 || soThangGoi < 1)
            return false;
        if (count < soLuongSo) {
            if (dsSoTietKiem[count] == null) {
                dsSoTietKiem[count] = new SoTietKiem(maSo, ngayMoSo, soThangGoi, soTienGoi, kyHan, laiSuat);
                count++;
            }
        } else
            return false;
        return true;
    }

    public String toString() {
        String thongTinSTK = "";
        for (int i = 0; i < count; i++)
            thongTinSTK += dsSoTietKiem[i].toString() + "\n";
            
        return String.format("Khách hàng: %s - %s \n%s", maKH, hotenKH, thongTinSTK);
    }
}

package bai10;

public class SinhVien {
	private String maSV;
	private String hoTen;

    public SinhVien(String maSV, String hoTen) {
        setMaSV(maSV);
        setHoTen(hoTen);
    }

    public SinhVien() {
        this("", "");
    }

    public String getMaSV1() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if(maSV.length() == 0 || maSV.equals(""))
            maSV = "0";
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (hoTen.length() == 0 || hoTen.equals(""))
            hoTen = "Chưa xác định";
        this.hoTen = hoTen;
    }

    public String toString() {
        return String.format("%7s | %-20s", maSV, hoTen);
    }

	public String getMaSV() {
		// TODO Auto-generated method stub
		return null;
	}
}

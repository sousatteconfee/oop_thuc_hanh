package sourcecode.bai01;


public class ChuyenXe {
    private String maSo;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;

    public ChuyenXe(String maSo, String hoTenTaiXe, String soXe, double doanhThu) {
        setMaSo(maSo);
        setHoTenTaiXe(hoTenTaiXe);
        setSoXe(soXe);
        setDoanhThu(doanhThu);
    }

    // Hàm getter và setter cho các thuộc tính
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo.isBlank() ? "xxx" : maSo;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe.isBlank() ? "xxx" : hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe2) {
        this.soXe = soXe2.isBlank() ? "xxx" : soXe2;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu > 0 ? doanhThu : 0;
    }

	@Override
	public String toString() {
		return "ChuyenXe [maSo=" + maSo + ", hoTenTaiXe=" + hoTenTaiXe + ", soXe=" + soXe + ", doanhThu=" + doanhThu
				+ "]";
	}
    
    
}



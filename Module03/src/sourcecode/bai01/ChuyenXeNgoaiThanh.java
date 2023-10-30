package sourcecode.bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        setNoiDen(noiDen);
        setSoNgayDiDuoc(soNgayDiDuoc);
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen.isEmpty() ? "xxx" : noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = (soNgayDiDuoc > 0) ? soNgayDiDuoc :0;
    }

	@Override
	public String toString() {
		return super.toString() +  "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + "]";
	}

    
}

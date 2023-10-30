package sourcecode.bai06;

import java.text.DecimalFormat;

public class HangDienMay extends HangHoa {
	DecimalFormat df = new DecimalFormat("#,##0");
	private int timeBaoHanh;
	private int congSuat;

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int timeBaoHanh, int congSuat)
			throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setTimeBaoHang(timeBaoHanh);
		setCongSuat(congSuat);
	}

	public HangDienMay() throws Exception {
		this("xxx", "xxx", 0, 0, 0, 0);
	}

	public int getTimeBaoHanh() {
		return timeBaoHanh;
	}

	public void setTimeBaoHang(int timeBaoHanh) {
		if (timeBaoHanh >= 0)
			this.timeBaoHanh = timeBaoHanh;
		else
			this.timeBaoHanh = 0;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		if (congSuat >= 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}

	@Override
	public double tinhTienVAT() {
		return super.getDonGia() * 0.1;
	}

	@Override
	public String danhGiaMucDoBuonBan() {
		if (super.getSoLuongTon() < 3) {
			return "Bán được";
		} else
			return "-";
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15d %-15d %-15s %-15s %-15s %-15s %-15s %-15s %-15s ", super.toString(),
				this.timeBaoHanh, this.congSuat, "-", "-", "-", "-", "-", df.format(tinhTienVAT()),
				danhGiaMucDoBuonBan());
	}

}

package sourcecode.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DecimalFormat df = new DecimalFormat("#,##0");
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}

	public HangSanhSu() throws Exception {
		this("xxx", "xxx", 0, 0, "xxx", LocalDate.now());
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		if (!nhaSanXuat.trim().equals(""))
			this.nhaSanXuat = nhaSanXuat;
		else
			this.nhaSanXuat = "xxx";
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = LocalDate.now();
	}

	public long tinhSoNgayLuuKho() {
		LocalDate now = LocalDate.now();
		long sn = ngayNhapKho.until(now, ChronoUnit.DAYS);
		return sn;
	}

	@Override
	public double tinhTienVAT() {
		return super.getDonGia() * 0.1;
	}

	@Override
	public String danhGiaMucDoBuonBan() {
		if (super.getSoLuongTon() > 50 && tinhSoNgayLuuKho() > 10) {
			return "Bán chậm";
		} else
			return "-";
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s ", super.toString(), "-", "-",
				this.nhaSanXuat, dtf.format(ngayNhapKho), "-", "-", "-", df.format(tinhTienVAT()),
				danhGiaMucDoBuonBan());
	}

}

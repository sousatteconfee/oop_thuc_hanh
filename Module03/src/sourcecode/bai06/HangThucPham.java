package sourcecode.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DecimalFormat df = new DecimalFormat("#,##0");
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public HangThucPham() throws Exception {
		this("xxx", "xxx", 0, 0, "xxx", LocalDate.now(), LocalDate.now());
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		if (!nhaCungCap.trim().equals(""))
			this.nhaCungCap = nhaCungCap;
		else
			this.nhaCungCap = "xxx";
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngayHetHan))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = this.ngaySanXuat;
	}

	@Override
	public double tinhTienVAT() {
		return super.getDonGia() * 0.05;
	}

	@Override
	public String danhGiaMucDoBuonBan() {
		if (super.getSoLuongTon() > 0 && !this.ngayHetHan.isAfter(this.ngaySanXuat)) {
			return "Khó Bán";
		} else
			return "-";
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s", super.toString(), "-", "-",
				"-", "-", this.nhaCungCap, dtf.format(ngaySanXuat), dtf.format(ngayHetHan), df.format(tinhTienVAT()),
				danhGiaMucDoBuonBan());
	}

}

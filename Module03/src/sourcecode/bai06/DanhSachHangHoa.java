package sourcecode.bai06;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class DanhSachHangHoa implements Comparator<HangHoa> {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private HangHoa list[];
	int count;

	public DanhSachHangHoa(int n) {
		this.list = new HangHoa[n];
		this.count = 0;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count > 0 ? count : 0;
	}

	public boolean them(HangHoa h) {
		if (count < list.length) {
			list[count++] = h;
			return true;
		} else {
			return false;
		}

	}

	public DanhSachHangHoa timKiem(String maHang) {
		DanhSachHangHoa h1 = new DanhSachHangHoa(count);
		for (int i = 0; i < count; i++) {
			if (maHang.compareToIgnoreCase(list[i].getMaHang()) == 0) {
				h1.them(list[i]);
			}
		}
		return h1;
	}

	public boolean xoa(String maHang) {
		for (int i = 0; i < count; i++) {
			if (maHang.compareToIgnoreCase(list[i].getMaHang()) == 0) {
				for (int j = i; j < count - 1; j++) {
					list[j] = list[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;
	}

	public boolean Sua(String maHang, double donGia) {
		for (int i = 0; i < count; i++) {
			if (maHang.compareToIgnoreCase(list[i].getMaHang()) == 0) {
				list[i].setDonGia(donGia);
				return true;
			}
		}
		return false;
	}

	public void sapXepHangHoaTheoTen() {
		Arrays.sort(
			list, 0, count, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa x, HangHoa y) {
				return x.getMaHang().compareTo(y.getMaHang());
			}
		}
			);
	}

	public void sapXepHangHoaTheoSoLuongTonGiamDan() {

		Arrays.sort(list, 0, count, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getSoLuongTon() > o2.getSoLuongTon()) {
					return -1;
				} else if (o1.getSoLuongTon() < o1.getSoLuongTon()) {
					return 1;
				} else
					return 0;
			}
		});
	}

	public DanhSachHangHoa layThongTinHangHoaKhoBan() {
		DanhSachHangHoa h1 = new DanhSachHangHoa(count);
		for (int i = 0; i < count; i++) {
			if (list[i].danhGiaMucDoBuonBan().compareToIgnoreCase("Khó Bán") == 0) {
				h1.them(list[i]);
			}
		}
		return h1;
	}

	public String layThongTinHangHoa(String loaiHang) {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (loaiHang.equalsIgnoreCase("Hang Thuc Pham")) {
				if (list[i] instanceof HangThucPham) {
					s += list[i].toString();
					s += "\n";
				}
			} else if (loaiHang.equalsIgnoreCase("Hang Dien May")) {
				if (list[i] instanceof HangDienMay) {
					s += list[i].toString();
					s += "\n";
				}
			} else if (loaiHang.equalsIgnoreCase("Hang Sanh Su")) {
				if (list[i] instanceof HangSanhSu) {
					s += list[i].toString();
					s += "\n";
				}
			}
		}
		return s;
	}

	public String getTieuDe() {
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s", "Mã Hàng",
				"Tên Hàng", "Đơn Giá", "Số Luợng Tồn", "Time Bảo Hành", "Công Suất", "Nhà Sản Xuất", "Ngày Nhập Kho",
				"Nhà Cung Cấp", "Ngày Sản Xuất", "Ngày Hết Hạn", "Thuế VAT", "Mức độ buôn bán");
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += list[i].toString();
			s += "\n";
		}
		return s;
	}

	@Override
	public int compare(HangHoa o1, HangHoa o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

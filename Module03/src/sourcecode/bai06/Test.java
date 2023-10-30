package sourcecode.bai06;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			DanhSachHangHoa ds = new DanhSachHangHoa(10);
			int luachon;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("1.Thêm hàng hóa");
				System.out.println("2.Lấy thông tin toàn bộ danh sách.");
				System.out.println("3.lấy thông tin từng loại hàng hóa");
				System.out.println("4.Tìm kiếm hàng hóa khi biết mã hàng.");
				System.out.println("5.Sắp xếp hàng hóa theo tên hàng tăng dần.");
				System.out.println("6.Sắp xếp hàng hóa theo số lượng tồn giảm dần.");
				System.out.println("7.Lấy thông tin các hàng thực phẩm khó bán.");
				System.out.println("8.Xóa hàng hóa khi biết mã hàng.");
				System.out.println("9.Sửa thông tin đơn giá của hàng hóa khi biết mã hàng.");
				System.out.println("Nhập lựa chọn: ");
				luachon = sc.nextInt();

				switch (luachon) {
				case 1:
					int tmp;
					System.out.println("1.Thêm hàng thực phẩm.");
					System.out.println("2.Thêm hàng sành sứ.");
					System.out.println("3.Thêm hàng điện máy.");
					System.out.println("Mời bạn nhập lựa chọn: ");
					sc.nextLine();
					tmp = sc.nextInt();
					switch (tmp) {
					case 1:
						ds.them(new HangThucPham("TP1", "Gạo", 1000, 10, "Ricefood", LocalDate.of(2019, 12, 27),
								LocalDate.of(2020, 7, 12)));
						break;
					case 2:
						ds.them(new HangSanhSu("SS1", "Ấm chén", 500000, 10, "Thăng Long", LocalDate.of(2017, 1, 12)));
						break;
					case 3:
						ds.them(new HangDienMay("DM1", "Máy bơm", 20000, 5, 12, 3000));
						break;
					}
					break;
				case 2:
					System.out.println(ds.getTieuDe());
					System.out.println(ds.toString());
					break;
				case 3:
					String hang;
					sc = new Scanner(System.in);
					System.out.println("Nhập vào loại hàng cần xuất: ");
					hang = sc.nextLine();
					System.out.println(ds.getTieuDe());
					System.out.println(ds.layThongTinHangHoa(hang));
					break;
				case 4:
					sc = new Scanner(System.in);
					String maHang;
					System.out.println("Nhập mã hàng cần tìm: ");
					maHang = sc.nextLine();
					DanhSachHangHoa g = ds.timKiem(maHang);
					System.out.println(ds.getTieuDe());
					System.out.println(g.toString());
					break;
				case 5:
					ds.sapXepHangHoaTheoTen();
					break;
				case 6:
					ds.sapXepHangHoaTheoSoLuongTonGiamDan();
					break;
				case 7:
					DanhSachHangHoa k = ds.layThongTinHangHoaKhoBan();
					System.out.println(ds.getTieuDe());
					System.out.println(k.toString());
					break;
				case 8:
					sc.nextLine();
					String maHang1;
					System.out.println("Nhập mã hàng cần xóa: ");
					maHang1 = sc.nextLine();
					ds.xoa(maHang1);
					break;
				case 9:
					String maHang2;
					sc.nextLine();
					System.out.println("Nhập mã hàng cần cập nhật lại đơn giá:");
					maHang2 = sc.nextLine();
					ds.Sua(maHang2, 30000);
					break;
				}

			} while (luachon > 0 && luachon <= 9);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
package sourcecode.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Test {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#,##0NVD");
		DanhSachSach ds = new DanhSachSach(100);
		ds.them(new Book("123", LocalDate.of(2012, 12, 12), 100000, 2, "Kim Đồng"));
		ds.them(new SachGiaoKhoa("1213", LocalDate.of(2019, 2, 12), 1000, 1, "Hồ Chí Minh", false));
		ds.them(new SachThamKhao("1234", LocalDate.of(2020,12,19), 20000, 3, "Trạng Quỳnh", 1.5));
		ds.them(new Book("435", LocalDate.of(2019, 7, 23), 300000, 2, "Kim Đồng"));
		ds.them(new Book("222", LocalDate.of(2018, 12, 12), 100000, 2, "Kim Đồng"));
		ds.them(new SachGiaoKhoa("4444", LocalDate.of(2015, 3, 12), 1000, 1, "Hồ Chí Minh", true));
		ds.them(new SachGiaoKhoa("1555", LocalDate.of(2019, 2, 12), 1000, 1, "Hồ Chí Minh", false));
		ds.them(new SachThamKhao("6666", LocalDate.of(2020,12,19), 20000, 3, "Trạng Quỳnh", 0.5));
		ds.them(new SachThamKhao("7777", LocalDate.of(2020,12,19), 20000, 3, "Trạng Quỳnh", 2.5));
		System.out.println("Tổng thành tiền sách giáo khoa = "+ df.format(ds.tinhTongThanhTienSGK()));
		System.out.println("Tổng thành tiền sách tham khảo = "+df.format(ds.tinhTongThanhTienSTK()));
		System.out.println("Tổng thành tiền cao nhất = "+ df.format(ds.timThanhTienCaoNhat()));
		System.out.println(ds.getTieuDe());
		System.out.println(ds.toString());
		Book[] p = ds.timSachGiaoKhoaTheoNXB("Hồ Chí Minh");
		String s = "";
		System.out.println("Các sách giáo khoa tìm theo Nhà xuất bản: ");
		for (Book book : p) {
			s+=book.toString();
			s+="\n";
		}
		System.out.println(s);
		
		

	}
}
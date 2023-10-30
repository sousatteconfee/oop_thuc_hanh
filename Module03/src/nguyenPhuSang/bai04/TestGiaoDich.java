package nguyenPhuSang.bai04;

import java.time.LocalDate;

public class TestGiaoDich {
	public static void main(String[] args) {
		GiaoDichVang gdv1=new GiaoDichVang("AK31", LocalDate.of(2023, 12, 03), 3100000, 1, "Vang 18k");
		GiaoDichVang gdv2=new GiaoDichVang("AK32", LocalDate.of(2021, 07, 03), 5100000, 1, "Vang 24k");
		GiaoDichVang gdv3=new GiaoDichVang("AK33", LocalDate.of(2021, 12, 03), 6200000, 2, "Vang 18k");
		
// 		GiaoDichTienTe tt01=new GiaoDichTienTe("VND11", LocalDate.of(2023, 15, 01), 200.000, 2, 2.000, "VND");
// 		GiaoDichTienTe tt02=new GiaoDichTienTe("USD11", LocalDate.of(2023, 12, 03), 2.000, 2, 24.000, "USD");
// 		GiaoDichTienTe tt03=new GiaoDichTienTe("EURO11", LocalDate.of(2023, 01, 02), 100.000, 1, 27.000, "EURO");
		
		System.out.println(gdv1);
		System.out.println(gdv2);
		System.out.println(gdv3);
		
//		System.out.println(tt01);
//		System.out.println(tt02);
//		System.out.println(tt03);
	}
}

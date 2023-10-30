package nguyenPhuSang.bai02;

import java.time.LocalDate;

public class TestSach {
	public static void main(String[] args) {
		/**
		 * tao sach giao khoa
		 */
		SachGiaoKhoa sgk1=new SachGiaoKhoa("A13", LocalDate.of(2013, 06, 20), 35000, 15, "HaNoi", "moi");
		SachGiaoKhoa sgk2=new SachGiaoKhoa("B11", LocalDate.of(2019, 03, 10), 15000, 5, "TienPhong", "cu");
		SachGiaoKhoa sgk3=new SachGiaoKhoa("C41", LocalDate.of(2023, 12, 11), 25000, 6, "NhaNam", "moi");
		/**
		 * tao sach tham khao
		 */
		SachThamKhao stk1=new SachThamKhao("tk11", LocalDate.of(2011, 07, 29), 25000, 10, "TienPhong", 4);
		SachThamKhao stk2=new SachThamKhao("tk01", LocalDate.of(2021, 12, 12), 45000, 8, "TienPhong", 3);
		SachThamKhao stk3=new SachThamKhao("tk03", LocalDate.of(2011, 07, 29), 35000, 5, "TienPhong", 7);
		/**
		 * xuat
		 */
		
		System.out.println(sgk1);
		System.out.println(sgk2);
		System.out.println(sgk3);
		
		System.out.println(stk1);
		System.out.println(stk2);
		System.out.println(stk3);
	}
}

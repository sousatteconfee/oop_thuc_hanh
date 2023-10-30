package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 10.Viết chương trình để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím.
HD: Dùng mã ASCII để kiểm tra hoặc dùng class Character: Character.isDigit(ký tự) để kiểm ký tự
có phải là số hay không.
 * @author ASUS
 *
 */
public class Bai10 {

	public static void main(String[] args) {
		Scanner nhapchuoi=new Scanner(System.in);
		System.out.println("Nhap chuoi cua ban: ");
		String s=nhapchuoi.nextLine();
		int dem = demKyTuSo(s);
		System.out.println("So ky tu so xuat hien trong chuoi ban nhap la: " + dem);
	}
	public static int demKyTuSo(String s) {
		int kq = 0;

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= '1' && s.charAt(i) <= '9')
				kq++;
		return kq;
	}

}

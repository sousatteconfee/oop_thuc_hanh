package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 8.Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi
 * @author ASUS
 *
 */

public class Bai08 {

	public static void main(String[] args) {
		Scanner nhapchuoi=new Scanner(System.in);
		System.out.println("Nhap vao chuoi ban muon: ");
		String c=nhapchuoi.nextLine();
		
		demKyTu(c);
	}
	public static void demKyTu(String str) {
		int dem = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				dem++;
			}
		}
		System.out.printf("Chuoi \"%s\" có %d ky tu 'a'.", str, dem);
	}
}

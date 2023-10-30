package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 3.Viết chương trình in ra tổng 1+3+5+…+n nếu n là số lẻ, 2+4+6+…+n nếu n là số chẵn.
 * @author Student
 *
 */

public class Bai03 {
	
    public static void main(String[] args) {
			// nhap
			int n;
			Scanner nhapn=new Scanner(System.in);
			System.out.println("Nhap gia tri n: ");
			n=nhapn.nextInt();
			// xuat
			if (n%2==0) {
				System.out.println("Tong cac so chan =" + tinhTongChan(n));
			} else
				System.out.println("Tong cac so le =" + tinhTongLe(n));
	}

	public static int tinhTongChan(int n) {
		int tong1=0;
		for (int i = 2; i <= n; i = i + 2) {
			tong1+=i;
		}
		return tong1;
	}

	public static int tinhTongLe(int n) {
		int tong2=0;
		for (int i = 1; i <= n; i = i + 2) {
			tong2+=i;
		}
		return tong2;
	}
}

package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 7.Tính tổng các số nguyên tố nhỏ hơn N
 * @author ASUS
 *
 */

public class Bai07 {

	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap so nguyen n: ");
		int n=nhap.nextInt();
		
		tinhTongSNT(n);

	}
	public static void tinhTongSNT(int n) {
		int tong=0;
		for (int i = 1; i < n; i++) {
			tong+=i;
		}
		System.out.println("Tong = "+tong);
	}
}

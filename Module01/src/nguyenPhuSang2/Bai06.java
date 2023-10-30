package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 6.Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không
 * @author ASUS
 *
 */

public class Bai06 {

	public static void main(String[] args) {
		//Nhap
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap so can kiem tra: ");
		int n=nhap.nextInt();
		
		kiemTraSNT(n);

	}
	public static void kiemTraSNT(int n) {
		boolean kt=false;
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				kt=true;
				break;
			}
		}
		if(!kt)
			System.out.println(n+" Do la so nguyen to");
		else
			System.out.println(n+" Khong phai la so nguyen to");

   }
}

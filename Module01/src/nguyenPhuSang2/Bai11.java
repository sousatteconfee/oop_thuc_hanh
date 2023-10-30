package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 11.Viết chương trình để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím.
HD: Dùng mã ASCII để kiểm tra hoặc dùng class Character: Character.isDigit(ký tự) để kiểm ký tự
có phải là số hay không.
 * @author ASUS
 *
 */
public class Bai11 {

	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		Scanner nhap=new Scanner(System.in);
		int n=nhap.nextInt();
		System.out.println("Day fibo can tim la: ");
		for(int i = 0;i<n;i++) {
			System.out.println(soFibo(i)+" ");
		}
	}
	public static int soFibo(int n) {
		if(n<0) {
			return -1;
		}else if(n==0 || n==1) {
			return n;
		}else {
			return soFibo(n-1) + soFibo(n-2);
		}
	}

}

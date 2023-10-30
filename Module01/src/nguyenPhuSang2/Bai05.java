package nguyenPhuSang2;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;
/**
 * 5.Viết chương trình tìm USCLN của 2 số nhập vào
 * @author ASUS
 *
 */
public class Bai05 {

	public static void main(String[] args) {
		//nhap
		int a, b;
		Scanner nhapab=new Scanner(System.in);
		System.out.println("Nhap a= ");
		a=nhapab.nextInt();
		System.out.println("Nhap b= ");
		b=nhapab.nextInt();
		//xuat
		System.out.println("USCLN = "+ timUCLN(a, b));
	}
	public static int timUCLN(int a, int b) {
		int gtr=1;
		for (int i = 1; i <= a && i <= b; i++) {
			if(a%i==0 && b%i==0) {
				gtr=i;
			}
		}
		return gtr;
	}

}

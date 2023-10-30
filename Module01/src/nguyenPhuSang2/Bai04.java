package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 4.Viết chương trình giải phương trình bậc 1
 * @author ASUS
 *
 */
public class Bai04 {
	
    public static void main(String[] args) {
    	  //nhap
    	  int a, b;
    	  Scanner nhapab=new Scanner(System.in);
          System.out.println("Nhap gia tri a: ");
          a=nhapab.nextInt();
          System.out.println("Nhap gia tri b: ");
          b=nhapab.nextInt();
          
          //xuat
          giaiPTB1(a, b);
          
	}
     public static void giaiPTB1(int a, int b) {
		  if(a==0) {
			  if(b==0)
				  System.out.println("Phuong trinh bac 1 vo so nghiem");
			  else
				  System.out.println("Phuong trinh bac 1 vo nghiem");
		  }
		  else
			  System.out.println("Phuong trinh co nghiem x="+(-b/a));
    }
}

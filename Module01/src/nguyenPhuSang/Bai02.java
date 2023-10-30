package nguyenPhuSang;
/**
 * 2.Viết chương trình nhập vào tên của mình và xuất ra màn hình “Hello + Tên”
 * @author Student
 *
 */
import java.util.Scanner;

public class Bai02 {
	
    public static void main(String[] args) {
    	//nhap
		Scanner nhapten=new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		String s=nhapten.nextLine();
		//xuat
		System.out.printf("Hello" + s);
	}
}

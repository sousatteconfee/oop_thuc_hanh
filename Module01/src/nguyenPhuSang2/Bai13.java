package nguyenPhuSang2;

/**
 * 13.Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
 * @author ASUS
 *
 */
public class Bai13 {

	public static void main(String[] args) {
		int n = 20;
		System.out.println("Tong 10 so chan dau tien la: " + tinhTong(n));
	}

	public static int tinhTong(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}

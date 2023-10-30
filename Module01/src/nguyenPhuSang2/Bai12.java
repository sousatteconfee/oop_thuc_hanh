
package nguyenPhuSang2;

/**
 * 12.Viết chương trình in ra những số lẻ từ 1 đến 99
 * @author ASUS
 *
 */
public class Bai12 {

	public static void main(String[] args) {
		int n = 99;
		inCacSoLe(n);
	}
		
	public static void inCacSoLe(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
    }
}

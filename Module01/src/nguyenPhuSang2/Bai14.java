package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 14.Viết chương trình cho nhập vào 1 mảng số nguyên và kiểm tra xem có giá trị k nào đó hay không.
 * @author ASUS
 *
 */
public class Bai14 {

	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang ban muon: ");
		int n=nhap.nextInt();
		int A[]=new int[n];
		System.out.println("Nhap phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("A[%d] = ", i);
			A[i]=nhap.nextInt();
		}
		System.out.println("Nhap k: ");
		int k = nhap.nextInt();
		int kt = kiemTraSoK(A, n, k);
		if (kt == -1)
			System.out.println("Khong xuat hien k trong mang");
		else
			System.out.printf("%d xuat hien trong mang", k);

	}

	public static int kiemTraSoK(int A[], int n, int k) {
		for (int i = 0; i < n; i++)
			if (A[i] == k)
				return A[i];
		return -1;
	}

}

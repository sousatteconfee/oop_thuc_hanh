package nguyenPhuSang2;

import java.util.Scanner;

/**
 * 15.Viết chương trình cho nhập vào 1 mảng số nguyên và kiểm tra xem có giá trị k nào đó hay không.
 * @author ASUS
 *
 */
public class Bai15 {

	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n=nhap.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("A[%d] = ", i);
			A[i] = nhap.nextInt();
		}
		System.out.println("GTLN: " + timGTLN(A, n));
		System.out.println("GTNN: " + timGTNN(A, n));

	}

	public static int timGTLN(int A[], int n) {
		int max = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] > max)
				max = A[i];
		}
		return max;
	}

	public static int timGTNN(int A[], int n) {
		int min = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] < min)
				min = A[i];
		}
		return min;
	}

}

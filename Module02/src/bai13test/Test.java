package bai13test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			DanhSachCongNhan cn = new DanhSachCongNhan(5);
			cn.themCongNhan(new CongNhan("Cao", "Phan Khanh Duy", 250, 12345));
			cn.themCongNhan(new CongNhan("Ly", "Xuan Tin", 400, 3435));
			cn.themCongNhan(new CongNhan("Ngo", "Van Vi", 100, 435654));
			cn.themCongNhan(new CongNhan("Le", "Quang Tuan", 210, 88888));
			cn.themCongNhan(new CongNhan("Pham", "Huu Phuc", 510, 18888));
			
			System.out.println(cn.toString());
			System.out.println("So luong cong nhan: " + cn.laySoLuongCN());
			
			System.out.println("\nCong nhan lam tren 20 san pham");
			DanhSachCongNhan cnTren20SP = cn.dsTren200SP();
			System.out.println(cnTren20SP.toString());
			
			MENU(cn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
public static void MENU(DanhSachCongNhan cn) {
		
	int luachon;
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Xoa cong nhan theo ma cong nhan");
	System.out.println("2.Sap xep theo so san pham giam dan");
	System.out.print("Nhap lua chon: ");
	luachon = sc.nextInt();
		switch (luachon) {
		case 1:
			int maxoa;
			System.out.print("Nhap ma can xoa: ");
			maxoa = sc.nextInt();
			cn.xoaCN(maxoa);
			System.out.println(cn.toString());
			break;
		case 2:
			cn.sortTangBySP();
			System.out.println(cn.toString());
		}
	}

}

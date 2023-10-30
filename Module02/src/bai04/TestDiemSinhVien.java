package bai04;

import java.util.Scanner;

public class TestDiemSinhVien {
	public static void main(String[] args) {
		DiemSinhVien svA=new DiemSinhVien(21021981, "Pham Thao Quyen", 8, 7);
		DiemSinhVien svB=new DiemSinhVien();
		svB.setMaSV(20072171);
		svB.setHoTen("Nguyen Thao Uyen");
		svB.setDiemLyThuyet(7);
		svB.setDiemThucHanh(10);
		DiemSinhVien svC=new DiemSinhVien();
		//svC=new DiemSinhVien(maSV, hoTen, diemLyThuyet, diemThucHanh);
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("MaSinhVien : ");
	    int maSV = sc.nextInt();
	    System.out.println("HoTen : ");
	    sc = new Scanner(System.in);
	    String hoTen = sc.nextLine();
	    System.out.println("DiemLyThuyet : ");
	    sc = new Scanner(System.in);
	    float diemLyThuyet = sc.nextFloat();
	    System.out.println("DiemThucHanh : ");
	    sc = new Scanner(System.in);
	    float diemThucHanh = sc.nextFloat();
	    
		System.out.println(DiemSinhVien.inTieuDe());
		System.out.println(svA);
        System.out.println(svB);
        System.out.println(svC);
        sc.close();
	}
}

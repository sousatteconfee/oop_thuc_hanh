package thamkhao;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HeThongCuaHang[] heThongCuaHang = new HeThongCuaHang[2];
		heThongCuaHang[0] = new HeThongCuaHang("Adidas", "Thoi trang");
		heThongCuaHang[1] = new HeThongCuaHang("The Pizza Company", "An uong");
		
		ThongTinLienHe[] thongTinLienHe = new ThongTinLienHe[6];
		thongTinLienHe[0] = new ThongTinLienHe("94", "Nguyen Trai", "Quan 1", "0839251590");
		thongTinLienHe[1] = new ThongTinLienHe("521", "CMT8", "Quan 10", "0838624572");
		thongTinLienHe[2] = new ThongTinLienHe("469", "Nguyen Huu Tho", "Quan 7", "0837754362");
		thongTinLienHe[3] = new ThongTinLienHe("105", "Nguyen Thai Hoc", "Quan 1", "1900633606");
		thongTinLienHe[4] = new ThongTinLienHe("638", "Quan Trung", "Quan Go Vap", "1900633606");
		if(heThongCuaHang[0].them(thongTinLienHe[0]))
			System.out.println("Them thanh cong: "+thongTinLienHe[0]);
		else
			System.out.println("Them khong thanh cong: "+thongTinLienHe[0]);
		if(heThongCuaHang[0].them(thongTinLienHe[1]))
			System.out.println("Them thanh cong: "+thongTinLienHe[1]);
		else
			System.out.println("Them khong thanh cong: "+thongTinLienHe[1]);
		if(heThongCuaHang[0].them(thongTinLienHe[2]))
			System.out.println("Them thanh cong: "+thongTinLienHe[2]);
		else
			System.out.println("Them khong thanh cong: "+thongTinLienHe[2]);
		if(heThongCuaHang[1].them(thongTinLienHe[3]))
			System.out.println("Them thanh cong: " +thongTinLienHe[3]);
		else
			System.out.println("Them khong thanh cong: "+thongTinLienHe[3]);
		if(heThongCuaHang[1].them(thongTinLienHe[4]))
			System.out.println("Them thanh cong: "+thongTinLienHe[4]);
		else
			System.out.println("Them khong thanh cong: "+thongTinLienHe[4]);
//		heThongCuaHang[0].them(thongTinLienHe[1]);
//		heThongCuaHang[0].them(thongTinLienHe[2]);
//		
//		heThongCuaHang[1].them(thongTinLienHe[3]);
//		heThongCuaHang[1].them(thongTinLienHe[4]);
		
		for(int i = 0; i < heThongCuaHang.length; i++) {
			System.out.println(heThongCuaHang[i]);
		}
		System.out.println("Nhap Quan can dem chi nhanh: ");
		String quan = in.nextLine();
		System.out.println("So luong chi nhanh cua " +heThongCuaHang[0].getTenHeThong() +" o "+quan+": "+heThongCuaHang[0].demChiNhanh(quan));
		System.out.println("Nhap Quan can dem chi nhanh: ");
		quan = in.nextLine();
		System.out.println("So luong chi nhanh cua " +heThongCuaHang[1].getTenHeThong() +" o "+quan+": "+heThongCuaHang[0].demChiNhanh(quan));
		
		heThongCuaHang[0].sapXepTenDuongTamDan();
		heThongCuaHang[1].sapXepTenDuongTamDan();
		System.out.println("Sap xep tang dan theo ten duong: \n"+heThongCuaHang[0]);
		System.out.println("Sap xep tang dan theo ten duong: \n"+heThongCuaHang[1]);
	}
}

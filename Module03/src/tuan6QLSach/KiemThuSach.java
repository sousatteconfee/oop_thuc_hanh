package tuan6QLSach;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class KiemThuSach {
	static DanhSachSach DS = new DanhSachSach();
	public static void main(String[] args) throws Exception {
		System.out.println("Quản lý thư viện");
		int chon=-1;
		do {
			Menu();
			System.out.println("Nhập lựa chọn: ");
			chon = new Scanner(System.in).nextInt();
			switch(chon) {
			case 1:
				nhapCung();
				break;
			case 2:
				themMem();
				break;
			case 3:
				suaSach();
				break;
			case 4:
				xoaSach();
				break;
			case 5:
				tieuDe();
				xuat();
				break;
			case 6:
				sortTheoDonGia();
				break;
			case 7:
				sortTheoNgayNhap();
				break;
			case 8:
				xuatDSXuatSGK();
				break;
			case 9:
				xuatDSXuatSTK();
				break;
			case 10:
				System.out.println(DS.getTongSoTien());
				break;
			}
		}while(chon!=11);
	}
	
	static void Menu()     {
		System.out.println("\t**********************************************");
		System.out.println("\t       Chương trình quản lý thư viện        **");
		System.out.println("\t* 1. Nhập cứng                              *");
		System.out.println("\t* 2. Nhập thêm 1 sách                       *");
		System.out.println("\t* 3. Xóa                                    *");
		System.out.println("\t* 4. Sửa                                    *");
		System.out.println("\t* 5. Xuất                                   *");
		System.out.println("\t* 6. Sắp xếp theo đơn giá                   *");
		System.out.println("\t* 7. Xuất danh sách SGK và tổng tiền SGK    *");
		System.out.println("\t* 8. Xuất danh sách STK và tổng tiền STK    *");
		System.out.println("\t* 9. Sắp xếp theo ngày nhập                 *");
		System.out.println("\t* 10. Xuất tổng số tiền các loại sách       *");
		System.out.println("\t* 11. Thoát                                 *");
		System.out.println("\t*********************************************");

	}

	static void menuSuaSGK() {
		System.out.println("\t***************************************");
		System.out.println("\t**    Mời nhập thông tin cần sửa     **");
		System.out.println("\t* 1.Ngày nhập        			       	*");
		System.out.println("\t* 2.Đơn giá  						  	*");
		System.out.println("\t* 3.Số lượng							*");
		System.out.println("\t* 4.Nhà xuất bản						*");
		System.out.println("\t* 5.Tình trạng						*");
		System.out.println("\t* 6.Về menu chính                 	*");
		System.out.println("\t***************************************");

	}

	static void menuSuaSTK() {
		System.out.println("\t***************************************");
		System.out.println("\t**    Mời nhập thông tin cần sửa     **");
		System.out.println("\t* 1.Ngày nhập        			       	*");
		System.out.println("\t* 2.Đơn giá  						  	*");
		System.out.println("\t* 3.Số lượng							*");
		System.out.println("\t* 4.Nhà xuất bản						*");
		System.out.println("\t* 5.Thuế       						*");
		System.out.println("\t* 6.Về menu chính                 	*");
		System.out.println("\t***************************************");

	}

	static void nhapCung()
	{
		Date date1 = new Date(2022 - 1900, 4, 12);
		Sach sach1 = new SachGiaoKhoa("TV1", date1, 25000, 50, "Kim Đồng", true);
		Date date2 = new Date(2022 - 1900, 7, 12);
		Sach sach2 = new SachGiaoKhoa("TV1", date2, 25000, 50, "Nguyễn Nhật Ấnh", false);
		Date date3 = new Date(2022 - 1900, 9, 21);
		Sach sach3 = new SachThamKhao("DB1", date3, 50000, 43, "Hoa Mộc Lan", 2000);
		Date date4 = new Date(2022 - 1900, 4, 11);
		Sach sach4 = new SachThamKhao("MS1", date4, 400000, 21, "Cao Cư Giác", 2500);
		DS.themSach(sach1);
		DS.themSach(sach2);
		DS.themSach(sach3);
		DS.themSach(sach4);

	}
	static String tieuDe(){
		return String.format("|%-10s|%-15s|%-15s|%-10s|%-20s|%-30s|", " Mã sách", "Ngày nhập","Đơn giá", 
				"Số lượng", "Nhà XB", "Thuế(STK) hoặc Tình trạng(SGK)");
	}
	static void tieuDeSGK() {
		String s="";
		s+=String.format("%-15s|%-20s|%-5s|%-10s|%-15s|%-12s|%-10s","Mã sách","Nhà xuất bản","Số lượng","Đơn giá","Ngày nhập","Thành tiền","Tình trạng");
		System.out.println(s);
	}
	
	static void tieuDeSTK() {
		String s="";
		s+=String.format("%-15s|%-20s|%-5s|%-10s|%-15s|%-12s|%-10s","Mã sách","Nhà xuất bản","Số lượng","Đơn giá","Ngày nhập","Thành tiền","Thuế");
		System.out.println(s);
	}

	static Sach sach;
	
	static void themMem() throws Exception {
		Sach sach = themMotSach();
		if(sach!=null) {
			DS.them(sach);
			System.out.println("Thêm thành công");
		}else {
			System.out.println("Thêm không thành công");
		}
	}

	static Sach themMotSach(){
		try{
			String maSach, nhaXB;
			Date ngayNhap;
			int soLuong, ngay, thang, nam;
			double donGia;
			System.out.println("Nhập mã sách: ");
			maSach = new Scanner(System.in).nextLine();
			int vt =DS.timKiemViTri(maSach);
			if(vt != -1)
			{
				System.out.println("Mã sách đã trùng");
				return null;
			}
			else{
				System.out.println("\n Nhập ngày tháng năm: ");
				System.out.println("\n Nhập ngày: ");
				ngay = new Scanner(System.in).nextInt();
				System.out.println("\n Nhập tháng: ");
				thang = new Scanner(System.in).nextInt();
				System.out.println("\n Nhập năm: ");
				nam = new Scanner(System.in).nextInt();
				ngayNhap = new Date(nam-1900,vt-1,ngay);
				System.out.println("Nhập đơn giá: ");
				donGia = new Scanner(System.in).nextDouble();
				System.out.println("Nhập số lượng: ");
				soLuong = new Scanner(System.in).nextInt();
				System.out.println("Nhập nhà xuất bản: ");
				nhaXB = new Scanner(System.in).nextLine();
				System.out.println(" Nhập sách giáo khoa [1] hoặc khác để nhập sách tham khảo");
				int chon = new Scanner(System.in).nextInt();
				if(chon != 1){

					System.out.println(" Nhập [N] nếu là sách mới hoặc [0] nếu là sách cũ");
					String tinhTrang = new Scanner(System.in).next();
					while(!tinhTrang.equalsIgnoreCase("O") && !tinhTrang.equalsIgnoreCase("N")) {
						System.out.println("\n Vui lòng nhập theo yêu cầu!");
						tinhTrang = new Scanner(System.in).nextLine();
					}
					boolean tinhTrangBool;//= (tinhTrang == "N") ? true : false;
					if (tinhTrang!="N") {
						tinhTrangBool = true;
					}else {
						tinhTrangBool =false;
					}
					sach = new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXB, tinhTrangBool);
				}else {
					double thue;
					System.out.println("\n Nhập thuế: ");
					thue = new Scanner(System.in).nextDouble();
					sach = new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXB, thue);
				}
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return sach;
	}
	
	static void xoaSach()
	{
		try{
			System.out.println("Nhập mã sách cần xóa");
			String maSach = new Scanner(System.in).nextLine();
			Sach sachX = DS.timKiemDoiTuong(maSach);
			if(sachX != null)
			{
				System.out.println(" Bạn có xác nhận xóa sách này không [y/n]?");
				String acp = new Scanner(System.in).nextLine();
				if(acp.equalsIgnoreCase("y"))
				{

					DS.xoa(sach);
					throw new Exception("Đã xóa thành công");
				}
				else
				{
					throw new Exception("Bạn đã giữ lại sách này");
				}
			}
			else
				throw new Exception("Không tồn tại sách này");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

	static void thucHienMenuSua(int chon, Sach sachSua) throws Exception{
		int  ngay, thang, nam;
		Date ngayNhap;
		switch (chon) {
		case 1:
			System.out.println("\n Nhập ngày tháng năm: ");
			System.out.println("\n Nhập ngày: ");
			ngay = new Scanner(System.in).nextInt();
			System.out.println("\n Nhập tháng: ");
			thang = new Scanner(System.in).nextInt();
			System.out.println("\n Nhập năm: ");
			nam = new Scanner(System.in).nextInt();
			ngayNhap = new Date(nam-1900,thang-1,ngay);
			sachSua.setNgayNhap(ngayNhap);
			break;

		case 2:
			System.out.println(" Nhập đơn giá: ");
			sachSua.setDonGia(new Scanner(System.in).nextDouble());
			break;
		case 3:
			System.out.println(" Nhập số lượng: ");
			sachSua.setSoLuong(new Scanner(System.in).nextInt());
			break;
		case 4:
			System.out.println(" Nhập nhà xuất bản: : ");
			sachSua.setNhaXB(new Scanner(System.in).nextLine());
			break;

		}

	}
	static void suaSach() throws Exception{
		int chon = 0, cnt = 0, ngay, thang, nam;
		boolean check = false;
		
		System.out.println("Nhập mã sách cần sửa");
		String maSach = new Scanner(System.in).nextLine();
		Sach sachS = DS.timKiemDoiTuong(maSach);
		if(sachS != null){
			System.out.println("Thông tin sách trước khi sửa \n" + sachS);
			String tinhTrang;
			if(sachS instanceof SachGiaoKhoa){
				SachGiaoKhoa sachSua = (SachGiaoKhoa) sachS;
				do{
					menuSuaSGK();
					System.out.println("Nhập lựa chọn: ");
					chon = new Scanner(System.in).nextInt();
					cnt++;
					thucHienMenuSua(chon, sachSua);
					if(chon == 5){
						System.out.println(" Nhập [N] nếu là sách mới hoặc [0] nếu là sách cũ");
						tinhTrang = new Scanner(System.in).next();
						while(!tinhTrang.equalsIgnoreCase("0") && !tinhTrang.equalsIgnoreCase("N"))
						{
							System.out.println("Vui lòng nhập đúng yêu cầu");
							tinhTrang = new Scanner(System.in).nextLine();
						}
						boolean tinhTrangB = (tinhTrang == "N") ? true : false;
						sachSua.setTinhTrang(tinhTrangB);
					}
					if(chon == 6){
						if(cnt > 1)
							DS.sua(sachSua);
						System.out.println("Trở về menu chính");
					}
				}while (chon < 6);
			}else{
				SachThamKhao sachSua = (SachThamKhao) sachS;
				do{
					menuSuaSTK();
					System.out.println("Nhập lựa chọn: ");
					chon = new Scanner(System.in).nextInt();
					cnt++;
					thucHienMenuSua(chon, sachSua);
					if(chon == 5){
						System.out.println(" Nhập thuế");
						tinhTrang = new Scanner(System.in).next();
						
						sachSua.setThue(new Scanner(System.in).nextDouble());
					}
					if(chon == 6){
						if(cnt > 1)
							DS.sua(sachSua);
						System.out.println("Trở về menu chính");
					}
				}while (chon < 6);
			}
			}else{
				System.out.println("không tồn tại mã này");
			}
		}
static void sortTheoDonGia(){
	DS.sortTheoGiaTien();
	System.out.println("Đã sắp xếp thành công");
}
static void sortTheoNgayNhap() {
	DS.sortTheoNgayNhap();
	System.out.println("Đã sắp xếp thành công");
}


static void xuatDSXuatSGK() {
	System.out.println("\t\t\t Danh sách các loại sách giáo khoa \t\t\t\n\n");
	tieuDeSGK();
	for(Sach sGiaoKhoa : DS.getDSSachGiaoKhoa()) {
		System.out.println("\t"+sGiaoKhoa);
	}
	DecimalFormat df = new DecimalFormat("#,##0.00VND");
	String tong = df.format(DS.getTongSoTienSGK());
	System.out.println("\t Tổng số tiền: "+tong);
	System.out.println("\n\n");
}

static void xuatDSXuatSTK() {
	System.out.println("\t\t\t Danh sách các loại sách tham khao \t\t\t\n\n");
	tieuDeSTK();
	for(Sach sThamKhoa : DS.getDSSachThamKhao()) {
		System.out.println("\t"+sThamKhoa);
	}
	DecimalFormat df = new DecimalFormat("#,##0.00VND");
	String tong = df.format(DS.getTongSoTienSTK());
	System.out.println("\t Tổng số tiền: "+tong);
	System.out.println("\n\n");
}

static void xuat() {
	for(Sach s : DS.gethetSach()) {
		System.out.println(s);
	}
}

		
		
	}



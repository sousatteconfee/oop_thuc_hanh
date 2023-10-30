package tuan6QLSach;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Scanner;

public class KiemThu {
	static DanhSachSach DS = new DanhSachSach();
	private static boolean tinhTrangBool;

	public static void main(String[] args) throws Exception{
		System.out.println("quản lý thư viện: ");
		int chon = -1;
		do{
			Menu();
			System.out.println("nhập lựa chọn: ");
			chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				nhapCung();
				break;
			case 2:
				themMem();
				break;
			case 3:
				xoa();
				break;
			case 4:
				//
			case 5:
				xuat();
				break;
			case 6:
				sortTheoDonGia();;
				break;
			case 7:
				xuatDSTheoSGK();
				tieuDeSGK();
				break;
			case 8:
				xuatDSTheoSTK();;
				tieuDeSTK();
				break;
			case 9:
				sortTheoNgayNhap();;
				break;
			case 10:
				System.out.println(DS.getTongSoTien());
				break;
			default:
				
				break;
			}
			
			
		}while(chon > 13);
	}
	static void Menu(){
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
	
	
	
	static Sach sach;
	static void nhapCung(){

	}

	static String tieuDe(){
		return String.format("|%-10s|%-15s|%-15s|%-10s|%-20s|%-30s|", " Mã sách", "Ngày nhập","Đơn giá", 
				"Số lượng", "Nhà XB", "Thuế(STK) hoặc Tình trạng(SGK)");
	}

	static String tieuDeSGK(){
		String s ="";
		s+=String.format("%-15s|%-20s|%-5s|%-10s|%-15s|%-12s|%-10s","Mã sách","Nhà xuất bản","Số lượng","Đơn giá","Ngày nhập","Thành tiền","Tình trạng");
		System.out.println(s);
		return s;
	}

	static String tieuDeSTK(){
		String s="";
		s+=String.format("%-15s|%-20s|%-5s|%-10s|%-15s|%-12s|%-10s","Mã sách","Nhà xuất bản","Số lượng","Đơn giá","Ngày nhập","Thành tiền","Thuế");
		System.out.println(s);
		return s;
	}

	static void themMem() throws Exception{
		Sach sach = themMotSacḥ();
		if(sach != null){
			DS.them(sach);
			System.out.println("thêm thành công");
		}
		else{
			System.out.println("thêm không thành công");
		}
	}

	static Sach themMotSacḥ(){
		try{
			String maSach, nhaXuatB;
			Date ngayNhap;
			int soLuong, ngay, thang, nam;
			double donGia;

			System.out.println("nhập mã sách: ");
			maSach = new Scanner(System.in).nextLine();
			int vt = DS.timKiemViTri(maSach);
			if( vt != 1){
				System.out.println("mã sách trùng!");
				return null;
			}else{
				System.out.println("nhập ngày tháng năm: ");
				System.out.println("nhập ngày: ");
				ngay = new Scanner(System.in).nextInt();
				System.out.println("nhập tháng: ");
				thang = new Scanner(System.in).nextInt();
				System.out.println("nhập năm: ");
				nam = new Scanner(System.in).nextInt();
				ngayNhap = new Date(nam-1900,vt-1,ngay);
				System.out.println("nhập số lượng: ");
				soLuong = new Scanner(System.in).nextInt();
				System.out.println("nhập đơn giá: ");
				donGia = new Scanner(System.in).nextDouble();
				System.out.println("nhập nxb: ");
				nhaXuatB = new Scanner(System.in).nextLine();
				System.out.println("nhập [1] nếu là SGK hoặc khác nếu là STK");
				int chon = new Scanner(System.in).nextInt();
				if( chon != 1){
					System.out.println("nhập [N] nếu là sách mới hoặc [O] nếu là sách cũ");
					String tinhTrang = new Scanner(System.in).next();
					while(!tinhTrang.equalsIgnoreCase("O") && !tinhTrang.equalsIgnoreCase("N"))
					{
						System.out.println("vui lòng nhập đúng yêu cầu");
						tinhTrang = new Scanner(System.in).nextLine();
					}
					boolean tinhTrangBool;
					if(tinhTrang != "N"){
						tinhTrangBool = true;
					}
					else{ 
						tinhTrangBool = false;
					}

					sach = new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXuatB, tinhTrangBool);
				}
				else
				{
					double thue;
					System.out.println("nhập thuế: ");
					thue = new Scanner(System.in).nextDouble();
					sach = new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXuatB, thue);
				}
			}

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return sach;
	}

	static void xoa(){
		try{
			System.out.println("nhập mã sách cần xóa: ");
			String maSach = new Scanner(System.in).nextLine();
			Sach sachX = DS.timKiemDoiTuong(maSach);
			if( sachX != null){
				System.out.println("Bạn có chắc muốn xóa sách này không[y/n]?");
				String acp = new Scanner(System.in).nextLine();
				if(acp.equalsIgnoreCase("y")){
					DS.xoa(sach);
					System.out.println("xóa thành công");
				}else{
					System.out.println("bạn giữ lại sách này");
				}
			}
			else{
				System.out.println("mã sách k tồn tại");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}








static void sortTheoDonGia(){
	DS.sortTheoGiaTien();
	System.out.println("đã sắp xếp thành công");
}

static void sortTheoNgayNhap(){
	DS.sortTheoNgayNhap();
	System.out.println("đã sắp xếp thành công");
}

static void xuatDSTheoSGK(){
	System.out.println("danh sách sgk: ");
	tieuDeSGK();
	for (Sach sSachGK : DS.getDSSachGiaoKhoa()) {
		System.out.println("\t" +sSachGK);
	}
	DecimalFormat df = new DecimalFormat("#,##0.00VND");
	String tong = df.format(DS.getTongSoTienSGK());
	System.out.println("\t Tổng số tiền: "+tong);
	System.out.println("\n\n");
}

static void xuatDSTheoSTK(){
	System.out.println("DS STK: ");
	tieuDeSTK();
	for( Sach sSachTK : DS.getDSSachThamKhao()){
		System.out.println("\t" +sSachTK);
	}
	DecimalFormat df = new DecimalFormat("#,##0.00VND");
	String tong = df.format(DS.getTongSoTienSTK());
	System.out.println("\t Tổng số tiền: "+tong);
	System.out.println("\n\n");
}

static void xuat(){
	for (Sach s : DS.gethetSach()) {
		System.out.println(s);
	}
}
}

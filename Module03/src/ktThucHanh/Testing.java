package ktThucHanh;

public class Testing {
	
	public static void main(String[] args) {
		
		QuanLiDanhSachSap list = new QuanLiDanhSachSap();
		
		System.out.println(list.them(new SapThucPham("TP001", 35.2, 75000000, 600000, 500000)) ? "Them thanh cong" : "Them that bai vi trung ma");
		System.out.println(list.them(new SapThucPham("TP002", 60, 125000000, 600000, 500000)) ? "Them thanh cong" : "Them that bai vi trung ma");
		System.out.println(list.them(new SapThucPham("TP003", 100, 150000000, 600000, 500000)) ? "Them thanh cong" : "Them that bai vi trung ma");
		System.out.println(list.them(new SapQuanAo("QA001", 50, 50000000, 350000)) ? "Them thanh cong" : "Them that bai vi trung ma");
		System.out.println(list.them(new SapQuanAo("QA002", 100, 100000000, 350000)) ? "Them thanh cong" : "Them that bai vi trung ma");
		
		System.out.println(list);
		
		System.out.println(list.laySoLuongSapTungLoai());
		
		System.out.println(list.layDSSapCoDienTichLonNhat());
		
		System.out.println("Sap xep cac sap theo thu tu giam dan theo doanh thu" + "\n" + list.sapXepSapTheoDoanhThuGiamDan());
	}
}

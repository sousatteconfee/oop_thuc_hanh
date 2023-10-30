package ktThucHanh;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.List;

public class QuanLiDanhSachSap {
	private ArrayList<Sap> list;
	
	/**
	 * Khởi tạo danh sách 
	 */
	public QuanLiDanhSachSap() {
		list = new ArrayList<Sap>();
	}
	
	/**
	 * Thêm một sạp vào danh sách
	 * @param sap
	 * @return true: nếu không có trùng mã, false: nếu không có trùng mã
	 */
	public boolean them(Sap sap) {
		for(Sap target : list) {
			if(target.getMaSap().equals(sap.getMaSap())) {
				return false;
			}
		}
		list.add(sap);
		return true;
	}
	
	public double timDienTichLonNhat() {
		double max = list.get(0).getDienTich();
		for(Sap target : list) {
			max = target.getDienTich() > max ? target.getDienTich() : max;
		}
		return max;
	}
	
	/**
	 * Lấy danh sách sạp có diện tích lớn nhất
	 * @return String: các thông tin của danh sách sạp có diện tích lớn nhất
	 */
	public String layDSSapCoDienTichLonNhat() {
		QuanLiDanhSachSap result = new QuanLiDanhSachSap();
		double max = timDienTichLonNhat();
		
		for(Sap target : list) {
			if(target.getDienTich() == max) {
				result.them(target);
			}
		}
		
		return result.toString();
	}
	
	/**
	 * Lấy số lượng các sạp của từng loại
	 * @return String: chuỗi thông tin số lượng từng loại sạp
	 */
	public String laySoLuongSapTungLoai() {
		String result = "";
		int soLuongSapThucPham = 0, soLuongSapQuanAo = 0;
		for(Sap target : list) {
			if(target instanceof SapThucPham) ++soLuongSapThucPham;
			else ++soLuongSapQuanAo;
		}
		result += ("So luong sap thuc pham la: " + soLuongSapThucPham + "\n");
		result += ("So luong sap quan ao la: " + soLuongSapQuanAo + "\n");
		return result;
	}
	
	/**
	 * Sắp xếp doanh thu các sạp theo giảm dần
	 * @return String: chuỗi thông tin các sạp
	 */
	public String sapXepSapTheoDoanhThuGiamDan() {
		QuanLiDanhSachSap result = new QuanLiDanhSachSap();
		
		for(Sap target : list) {
			result.them(target);
		}
		
		result.list.sort(new Comparator<Sap>() {
			@Override
			public int compare(Sap o1, Sap o2) {
				if(o2.getDoanhThu() > o1.getDoanhThu()) return 1;
				else if(o2.getDoanhThu() < o1.getDoanhThu()) return -1;
				else return 0;
			}
		});
		
		return result.toString();
	}
	
	/**
	 * Lấy thông tin của đối tượng
	 */
	public String toString() {
		String result = "";
		result += ("Danh sach sap thuc pham" + "\n" + SapThucPham.getTitle() + "\n");
		for(Sap target : list) {
			if(target instanceof SapThucPham) {
				result += (target + "\n");
			}
		}
		result += ("Danh sach sap quan ao" + "\n" + SapQuanAo.getTitle() + "\n");
		for(Sap target : list) {
			if(target instanceof SapQuanAo) {
				result += (target + "\n");
			}
		}
		return result;
	}
}

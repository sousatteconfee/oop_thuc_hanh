package sourcecode.bai01;

public class Test {
	    public static void main(String[] args) {
	        // Tạo đối tượng chuyến xe nội thành
	        ChuyenXeNoiThanh cxnt = new ChuyenXeNoiThanh("CX001", "Nguyễn Văn A", "29A-12345", 1500000, 1, 50);

	        // In thông tin chuyến xe nội thành
	        System.out.println("Chuyến xe nội thành: " + cxnt.getMaSo());
	        System.out.println("Họ tên tài xế: " + cxnt.getHoTenTaiXe());
	        System.out.println("Số xe: " + cxnt.getSoXe());
	        System.out.println("Số tuyến: " + cxnt.getSoTuyen());
	        System.out.println("Số km đi được: " + cxnt.getSoKmDiDuoc());
	        System.out.println("Doanh thu: " + cxnt.getDoanhThu());

	        // Tạo đối tượng chuyến xe ngoại thành
	        ChuyenXeNgoaiThanh cxntt = new ChuyenXeNgoaiThanh("CX002", "Trần Thị B", "29A-67890", 2500000, "Hà Nội", 3);

	        // In thông tin chuyến xe ngoại thành
	        System.out.println("Chuyến xe ngoại thành: " + cxntt.getMaSo());
	        System.out.println("Họ tên tài xế: " + cxntt.getHoTenTaiXe());
	        System.out.println("Số xe: " + cxntt.getSoXe());
	        System.out.println("Nơi đến: " + cxntt.getNoiDen());
	        System.out.println("Số ngày đi được: " + cxntt.getSoNgayDiDuoc());
	        System.out.println("Doanh thu: " + cxntt.getDoanhThu());
	    }
	}

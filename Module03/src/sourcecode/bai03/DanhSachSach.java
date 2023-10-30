package sourcecode.bai03;

import java.text.DecimalFormat;
import java.util.Arrays;

public class DanhSachSach {
	DecimalFormat df = new DecimalFormat("#,##0NVD");
	private Book[] list;
	private int count;

	public DanhSachSach(int n) {
		this.list = new Book[n];
		this.count = 0;
	}

	public boolean them(Book b) {
		if (this.count < list.length) {
			list[count++] = b;
			return true;
		} else
			return false;
	}

	public double tinhTongThanhTienSGK() {	
		double total = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof SachGiaoKhoa) {
				total += list[i].getThanhTien();
			}
		}
		return total;
	}

	public double tinhTongThanhTienSTK() {
		double kq = 0;
		for(int i=0;i<count;i++)
		{
			if( list[i] instanceof SachThamKhao)
			{
				kq += list[i].getThanhTien();
			}
		}
		return kq;
	}

	public Book[] timSachGiaoKhoaTheoNXB(String nxb) {
		Book[] b = new Book[count];
		int index = 0;
		for (int i = 0; i < count; i++) {
			if (list[i].getNXB().compareToIgnoreCase(nxb) == 0 && (list[i] instanceof SachGiaoKhoa)) {
				b[index++] = list[i];
			}
		}
		Book kq[] = Arrays.copyOf(b, index);
		return kq;
	}

	public double timThanhTienCaoNhat() {
		double max = list[0].getThanhTien();
		for (int i = 0; i < count; i++) {
			if (list[i].getThanhTien() >= max) {
				max = list[i].getThanhTien();
			}
		}
		return max;
	}

	public String getTieuDe()
	{
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s","Mã Sách","Ngày Nhâp","Đơn giá","Số lượng","Nhà Xuất Bản","Tình Trạng","Thuế");
	}
	@Override
	public String toString() {
		String s = "";
		for(int i = 0;i<count;i++)
		{
			s+=list[i].toString();
			s+="\n";
		}
		return s;
	}

	
}
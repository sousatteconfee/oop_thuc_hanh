package tuan6QLSach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class DanhSachSach {
	private ArrayList<Sach>  thuVienSach;
	public DanhSachSach(){
		thuVienSach = new ArrayList<Sach>();
	}


	public boolean them(Sach s) throws Exception
	{
		if(thuVienSach.contains(s)){ 
			return false;
			}
		
			else {
				thuVienSach.add(s);
				return true; 
			}

	}

	public ArrayList<Sach> gethetSach()
	{
		return thuVienSach;
	}

	public void xoa(Sach sachDeXoa){
		thuVienSach.remove(sachDeXoa);
	}

	public Sach timKiemDoiTuong(String maSach){
		for(Sach sach : thuVienSach)
			if(sach.getMaSach().equalsIgnoreCase(maSach))
				return sach;
		return null;
	}

	public int timKiemViTri(String maSach){
		Sach findSach = timKiemDoiTuong(maSach);
		if(findSach != null)
			return thuVienSach.indexOf(findSach);
		return -1;
	}

	public void sua(Sach sachSua){
		int vt = timKiemViTri(sachSua.getMaSach());
		if(vt != -1)
			thuVienSach.set(vt, sachSua);
	}
	//sắp xếp theo tên nhà xuất bản
		public void sortTheoNXB() {
			Collections.sort(thuVienSach,new Comparator<Sach>() {
				public int compare(Sach sach1, Sach sach2) {
					return sach1.getNhaXB().compareToIgnoreCase(sach2.getNhaXB());
				}
			});
		}
		//Trả về danh sách SGK
	public ArrayList<Sach> getDSSachGiaoKhoa() {
		ArrayList<Sach> dSSachGiaoKhoa = new ArrayList<Sach>();
		for (Sach s : thuVienSach )
			if( s instanceof SachGiaoKhoa)
				dSSachGiaoKhoa.add(s);

		return dSSachGiaoKhoa;

	}
	//Trả về danh sách STK
	public ArrayList<Sach> getDSSachThamKhao() {
		ArrayList<Sach> dSSachThamKhao = new ArrayList<Sach>();
		for (Sach s : thuVienSach )
			if( s instanceof SachThamKhao)
				dSSachThamKhao.add(s);

		return dSSachThamKhao;

	}
// sắp xếp theo giá tiền
	public void sortTheoGiaTien(){
		Collections.sort(thuVienSach, new Comparator<Sach>() {
			@Override
			public int compare(Sach o1, Sach o2) {
				Double gia1 = o1.getDonGia();
				Double gia2 = o2.getDonGia();

				return gia1.compareTo(gia2);
			}

			private void getDonGia() {
				// TODO Auto-generated method stub

			}
		});
	}
// sắp xếp theo ngày nhập
	public void sortTheoNgayNhap(){
		Collections.sort(thuVienSach, new Comparator<Sach>(){

			@Override
			public int compare(Sach o1, Sach o2) {
				Date d1 = o1.getNgayNhap();
				Date d2 = o2.getNgayNhap();
				return d1.compareTo(d2);
			}

		
	});
	}

	public double getTongSoTien(){
		double tt = 0;
		for(Sach sach : thuVienSach){
			tt += sach.thanhTien();
		}
		return tt;
	}
	
	public double getTongSoTienSGK(){
		double tt = 0;
		for(Sach sach : thuVienSach){
			if(sach instanceof SachGiaoKhoa)
			tt += sach.thanhTien();
		}
		return tt;
	}
	
	public double getTongSoTienSTK(){
		double tt = 0;
		for(Sach sach : thuVienSach){
			if(sach instanceof SachThamKhao)
			tt += sach.thanhTien();
		}
		return tt;
	}


	public void themSach(Sach sach1) {
		// TODO Auto-generated method stub
		
	}





	
	


	

}

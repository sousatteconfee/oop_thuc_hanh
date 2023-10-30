package bai13test;


public class DanhSachCongNhan {
	
	private int kichThuocMang;
	private CongNhan[] cn;

	public DanhSachCongNhan(int n) {
		this.kichThuocMang = 0;
		this.cn = new CongNhan[n];
	}

	public void themCongNhan(CongNhan cn) throws Exception {
		if (this.kichThuocMang < this.cn.length) {
			this.cn[kichThuocMang++] = cn;
		} else
			throw new Exception("Lỗi: Vượt quá kích thước của mảng.");
	}

	public int laySoLuongCN() {
		return this.kichThuocMang;
	}

	public void xoaCN(int ma) {
		for (int i = 0; i < kichThuocMang; i++) 
			if (ma == cn[i].getMaCN()) 
				for (int j = i; j < kichThuocMang - 1; j++) 
					cn[j] = cn[j + 1];
		kichThuocMang--;
	}

	public DanhSachCongNhan dsTren200SP() throws Exception {
		DanhSachCongNhan t = new DanhSachCongNhan(kichThuocMang);
		for (int i = 0; i < kichThuocMang; i++) 
			if (cn[i].getmSoSP() >= 200) 
				t.themCongNhan(cn[i]);
		return t;
			
	}

	public void sortTangBySP() {
		for (int i = 0; i < kichThuocMang - 1; i++) 
			for (int j = i + 1; j < kichThuocMang; j++) 
				if (cn[i].getmSoSP() < cn[j].getmSoSP()) {
					CongNhan t = cn[i];
					cn[i] = cn[j];
					cn[j] = t;
				}
	}

	public static String getTieuDe() {
		return String.format("%-15s %-15s %17s %17s", "Ho", "Ten", "So san pham", "Ma Cong nhan")
				+"\n---------------------------------------------------------------------------\n-";
	}

	@Override
	public String toString() {
		String s = getTieuDe();
		for(int i=0;i<kichThuocMang;i++)
			s+=cn[i].toString() + "\n";
		s+="\n----------------------------------------------------------------------------\n";
		return s;
	}

}


package thamkhao;

public class HeThongCuaHang {
		private String tenHeThong;
		private String loaiDichVu;
		private ThongTinLienHe[] dsLienHe;
		private int count;
		
		public HeThongCuaHang(String tenHeThong, String loaiDichVu) {
			dsLienHe = new ThongTinLienHe[50];
			count = 0;
			setTenHeThong(tenHeThong);
			setLoaiDichVu(loaiDichVu);
		}
		
		public HeThongCuaHang() {
			this.tenHeThong = "xxx";
			this.loaiDichVu = "xxx";
		}

		public String getTenHeThong() {
			return tenHeThong;
		}
		public void setTenHeThong(String tenHeThong) {
			if(!tenHeThong.trim().equals(""))
				this.tenHeThong = tenHeThong;
			else
				this.tenHeThong = "xxx";
		}
		public String getLoaiDichVu() {
			return loaiDichVu;
		}
		public void setLoaiDichVu(String loaiDichVu) {
			if(!loaiDichVu.trim().equals(""))
				this.loaiDichVu = loaiDichVu;
			else
				this.loaiDichVu = "xxx";
		}
		public ThongTinLienHe[] getDsLienHe() {
			return dsLienHe;
		}
		public int getCount() {
			return count;
		}
		public String toString() {
			String s = "**Ten he thong cua hang: "+tenHeThong;
			s += "\nLoai dich vu: "+loaiDichVu+"\n";
			for(int i = 0; i < count; i++) {
				s = s +(i + 1) + ". "+ dsLienHe[i]+"\n";
			}
			return s;
		}
		public boolean them(ThongTinLienHe thongTin) {
			if(count < dsLienHe.length) {
				dsLienHe[count++] = thongTin;
				return true;
			}else
				return false;
		}
		public int demChiNhanh(String quan) {
			int dem = 0;
			for(int i = 0; i < count; i++) {
				if(dsLienHe[i].getQuan().equalsIgnoreCase(quan))
					dem++;
			}
			return dem;
		}
		public void sapXepTenDuongTamDan() {
			for(int i = 0; i < count - 1; i++) {
				for(int j = i + 1; j < count; j++) {
					if(dsLienHe[i].getDuong().compareTo(dsLienHe[j].getDuong()) > 0) {
						ThongTinLienHe temp = dsLienHe[i];
						dsLienHe[i] = dsLienHe[j];
						dsLienHe[j] = temp;
					}
				}
			}
		}
	}

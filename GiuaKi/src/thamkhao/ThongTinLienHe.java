package thamkhao;

public class ThongTinLienHe {
		private String soNha;
		private String duong;
		private String quan;
		private String dienThoai;
		public ThongTinLienHe(String soNha, String duong, String quan, String dienThoai) {
			setSoNha(soNha);
			setDuong(duong);
			setQuan(quan);
			setDienThoai(dienThoai);
		}
		public ThongTinLienHe() {
			this.soNha = "xxx";
			this.duong = "xxx";
			this.quan = "xxx";
			this.dienThoai = "xxxxxxxxxx";
		}
		public String getSoNha() {
			return soNha;
		}
		public void setSoNha(String soNha) {
			if(!soNha.trim().equals(""))
				this.soNha = soNha;
			else
				this.soNha = "xxx";
		}
		public String getDuong() {
			return duong;
		}
		public void setDuong(String duong) {
			if(!duong.trim().equals(""))
				this.duong = duong;
			else
				this.duong = "xxx";
		}
		public String getQuan() {
			return quan;
		}
		public void setQuan(String quan) {
			if(!quan.trim().equals(""))
				this.quan = quan;
			else
				this.quan = "xxx";
		}
		public String getDienThoai() {
			return dienThoai;
		}
		public void setDienThoai(String dienThoai) {
			if(!dienThoai.trim().equals("") && dienThoai.length() == 10)
				this.dienThoai = dienThoai;
			else
				this.dienThoai = "xxxxxxxxxx";
		}
		public String toString() {
			String s = "Dia chi: "+soNha+ " "+ duong + ", "+quan;
			s += "\n   So dien thoai: "+dienThoai;
			return s;
		}
	}

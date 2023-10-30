package bai10;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;
	private int count;

	public String getMaLHP() {
		return maLHP;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		if (tenGV.length() == 0 || tenGV.equals(""))
			tenGV = "Chưa xác định";
		this.tenGV = tenGV;
	}

	public void setMaLHP(String maLHP) {
		if (maLHP.length() == 0 || maLHP.equals(""))
			maLHP = "Chưa xác định";
		this.maLHP = maLHP;
	}

	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) {
		if (tenLHP.length() == 0 || tenLHP.equals(""))
			tenLHP = "Chưa xác định";
		this.tenLHP = tenLHP;
	}

	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}

	public void setThongTinLopHoc(String thongTinLopHoc) {
		if (thongTinLopHoc.length() == 0 || thongTinLopHoc.equals(""))
			thongTinLopHoc = "Chưa xác định";
		this.thongTinLopHoc = thongTinLopHoc;
	}

	public LopHocPhan() {
	}

	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc) {
		setMaLHP(maLHP);
		setTenLHP(tenLHP);
		setTenGV(tenGV);
		setThongTinLopHoc(thongTinLopHoc);
		count = 0;
		dsSV = new SinhVien[100];
		for (int i = 0; i < 100; i++) {
			dsSV[i] = new SinhVien();
		}

	}

	public boolean themHV(SinhVien x) {
		if (x != null) {
			if (count > 100) {
				System.out.println("Không thể thêm được, Mảng Full!!");
				return false;
			} else {
				for (int i = 0; i < count; i++) {
					if (dsSV[i].getMaSV().equalsIgnoreCase(x.getMaSV())) {
						System.out.println("mã học viên đã tồn tài");
						return false;
					}
				}
			}
			dsSV[count] = x;
			count++;
			return true;
		}
		return false;
	}

	public int getSoLuongSV() {
		return count;
	}

	public String ThongTinLopHocPhan() {
		return String.format("%-18s %d", "Tổng số sinh viên:", getSoLuongSV());
	}
}

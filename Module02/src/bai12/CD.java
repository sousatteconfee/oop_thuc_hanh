package bai12;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if (maCD < 0)
			maCD = 999999;
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if (tuaCD.equals("") || tuaCD.length() == 0)
			tuaCD = "Chưa xác định";
		this.tuaCD = tuaCD;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if (soBaiHat < 0)
			soBaiHat = 1;
		this.soBaiHat = soBaiHat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		if (giaThanh < 0)
			giaThanh = 1;
		this.giaThanh = giaThanh;
	}

	public CD(int soBaiHat, double giaThanh) {
		this.maCD = 999999;
		this.tuaCD = "Chưa xác định";
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}

	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}

	public CD() {
		this(0, "Chưa xác định", 0, 0.0f);
	}

	@Override
	public String toString() {
		return String.format("%-15d %-25s %-10d %-20.2f\n", maCD, tuaCD, soBaiHat, giaThanh);
	}
}

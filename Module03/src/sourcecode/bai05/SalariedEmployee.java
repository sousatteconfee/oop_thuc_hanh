package sourcecode.bai05;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	private int soTuan;

	public SalariedEmployee(String firstName, String lastName, int sSN, double weeklySalary, int soTuan) {
		super(firstName, lastName, sSN);
		setWeeklySalary(weeklySalary);
		setSoTuan(soTuan);

	}

	public SalariedEmployee() {
		super("xxx", "xxx", 1);
		this.weeklySalary = 0;
		this.soTuan = 0;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary > 0)
			this.weeklySalary = weeklySalary;
		else
			this.weeklySalary = 0;
	}

	public int getSoTuan() {
		return soTuan;
	}

	public void setSoTuan(int soTuan) {
		this.soTuan = soTuan;
	}

	@Override
	public double tinhTienLuong() {
		return this.weeklySalary * this.soTuan;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15.2f %-15d %-15s %-15s %-15s %-15s %-15s", super.toString(), this.weeklySalary,
				this.soTuan, "-", "-", "-", "-", "-");
	}

}

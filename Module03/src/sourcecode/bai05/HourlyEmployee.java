package sourcecode.bai05;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hour;

	public HourlyEmployee(String firstName, String lastName, int sSN, double wage, double hour) {
		super(firstName, lastName, sSN);
		setWage(wage);
		setHour(hour);
	}

	public HourlyEmployee() {
		this("xxx", "xxx", 0, 0, 0);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage > 0)
			this.wage = wage;
		else
			this.wage = 0;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		if (hour > 0)
			this.hour = hour;
		else
			this.hour = 0;
	}

	@Override
	public double tinhTienLuong() {
		return wage * hour;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15.2f %-15.2f %-15s %-15s %-15s ", super.toString(), "-", "-",
				this.wage, this.hour, "-", "-", "-");
	}

}

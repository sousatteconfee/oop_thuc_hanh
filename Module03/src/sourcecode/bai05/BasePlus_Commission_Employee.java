package sourcecode.bai05;

public class BasePlus_Commission_Employee extends CommissionRateEmployee {

	private double baseSalary;

	public BasePlus_Commission_Employee(String firstName, String lastName, int sSN, double gross, double comRate,
			double basesalary) {
		super(firstName, lastName, sSN, gross, comRate);
		setBaseSalary(basesalary);

	}

	public BasePlus_Commission_Employee() {
		this("xxx", "xxx", 0, 0, 0, 0);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 0)
			this.baseSalary = baseSalary;
		else
			this.baseSalary = 0;
	}

	@Override
	public double tinhTienLuong() {
		return baseSalary + super.tinhTienLuong();
	}

	@Override
	public String toString() {
		String s = "";
		s += super.getFirstName() + " " + super.getLastName();
		return String.format("%-15s %-15d %-15s %-15s %-15s %-15s %-15.2f %-15.2f %-15.2f", s, super.getSSN(), "-", "-",
				"-", "-", super.getGrossSales(), super.getCommissionRate(), this.baseSalary);
	}

}

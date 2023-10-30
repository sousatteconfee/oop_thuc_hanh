package sourcecode.bai05;

public class CommissionRateEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionRateEmployee(String firstName, String lastName, int sSN, double grossSales,
			double commissionRate) {
		super(firstName, lastName, sSN);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}

	public CommissionRateEmployee() {

		this("xxx", "xxx", 0, 0, 0);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales > 0)
			this.grossSales = grossSales;
		else
			this.grossSales = 0;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0)
			this.commissionRate = commissionRate;
		else
			this.commissionRate = 0;
	}

	@Override
	public double tinhTienLuong() {
		return this.grossSales + this.commissionRate;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15.2f %-15.2f %-15s", super.toString(), "-", "-", "-",
				"-", this.grossSales, this.commissionRate, "-");
	}

}

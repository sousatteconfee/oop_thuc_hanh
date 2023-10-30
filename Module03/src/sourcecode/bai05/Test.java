package sourcecode.bai05;

public class Test {
	public static void main(String[] args) {
		Employee[] ds = new Employee[100];
		ds[0] = new SalariedEmployee("Vu", "Huy", 28082, 100000000, 4);
		ds[1] = new CommissionRateEmployee("áda", "david", 124, 2132, 2132134);
		ds[2] = new HourlyEmployee("áda", "thomas", 0, 0, 0);
		ds[3] = new BasePlus_Commission_Employee("áda", "âffs", 124, 2131, 1243, 100000);
		System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Name", "SSN","weekly Salary","so Tuan" ,"wage", "hour",
				"gross Sales", "commission Rate", "base Salary");
		System.out.println(ds[0]);
		System.out.println(ds[1]);
		System.out.println(ds[2]);
		System.out.println(ds[3]);
		
	}
}

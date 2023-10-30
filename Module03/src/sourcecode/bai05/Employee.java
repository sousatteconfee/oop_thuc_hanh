package sourcecode.bai05;

public abstract class Employee {
	private String FirstName;
	private String LastName;
	private int SSN;

	public Employee(String firstName, String lastName, int sSN) {
		setFirstName(firstName);
		setLastName(lastName);
		setSSN(sSN);
	}

	public Employee() {
		this("xxx", "xxx", 0);
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.trim().equals("") == false)
			FirstName = firstName;
		else
			this.FirstName = "xxx";

	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		if (lastName.trim().equals("") == false)
			this.LastName = lastName;
		else
			this.LastName = "xxx";
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		if (sSN <= 0)
			this.SSN = 0;
		else
			this.SSN = sSN;
	}

	public double tinhTienLuong() {
		return 0;
	}

	@Override
	public String toString() {
		String s = "";
		s += this.FirstName + " " + this.LastName;
		return String.format("%-15s %-15d ", s, this.SSN);
	}

}

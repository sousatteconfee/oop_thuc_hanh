package nhanvien;

public class FullName 
{
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		if(lastName.trim().equals(""))
			this.lastName="";
		else
			this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) 
	{
		if(firstName.trim().equals(""))
			this.firstName="";
		else
			this.firstName = firstName;
	}
	private String lastName, firstName;
	public FullName(String lastName, String firstName)
	{
		setFirstName(firstName);
		setLastName(lastName);
	}
	public String toString()
	{
		return String.format("%s %s",lastName,firstName);
	}
}

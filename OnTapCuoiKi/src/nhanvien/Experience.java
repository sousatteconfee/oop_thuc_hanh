package nhanvien;

import java.time.LocalDate;

public class Experience extends Employee
{
	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}
	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear)
	{
		if(expInYear>0)
			this.expInYear = expInYear;
		else
			this.expInYear=0;
	}
	private int expInYear;
	public Experience(String ma, FullName hoTen, String soDienThoai, LocalDate birthday,int expInYear)
	{
		super(ma, hoTen, soDienThoai, birthday);
		setExpInYear(expInYear);
	}
	public String toString()
	{
		return String.format("%s Số năm kinh nghiệm:%d",super.toString(),expInYear);
	}
}

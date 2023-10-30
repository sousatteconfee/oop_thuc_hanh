package nhanvien;

import java.time.LocalDate;

public class Fresher extends Employee
{
	/**
	 * @return the gradYear
	 */
	public int getGradYear() {
		return gradYear;
	}
	/**
	 * @param gradYear the gradYear to set
	 */
	public void setGradYear(int gradYear)
	{
		if(gradYear<=LocalDate.now().getYear() && gradYear>getBirthday().getYear()+15)
			this.gradYear = gradYear;
		else
			this.gradYear=0;
	}
	/**
	 * @return the gradRank
	 */
	public char getGradRank() {
		return gradRank;
	}
	/**
	 * @param gradRank the gradRank to set
	 */
	public void setGradRank(char gradRank)
	{
		if(gradRank!='A'||gradRank!='B'||gradRank!='C')
			this.gradRank = 'X';
		else
			this.gradRank=gradRank;
	}
	private int gradYear;
	private char gradRank;
	public Fresher(String ma, FullName hoTen, String soDienThoai, LocalDate birthday,int gradYear,char gradRank)
	{
		super(ma, hoTen, soDienThoai, birthday);
		setGradYear(gradYear);
		setGradRank(gradRank);
	}
	public String toString()
	{
		return String.format("%s Năm tốt nghiệp:%d Xếp Hạng:%c",super.toString(),gradYear,gradRank);
	}

}

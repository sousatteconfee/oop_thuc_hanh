package nhanvien;

import java.time.LocalDate;

public class Intern extends Employee
{
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) 
	{
		if(major.trim().equals(""))
			this.major="NULL";
		else
			this.major = major;
	}
	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) 
	{
		if(semester>=6 && semester <=10)
			this.semester = semester;
		else
			this.semester =0;
	}
	private String major;
	private int semester;
	public Intern(String ma, FullName hoTen, String soDienThoai, LocalDate birthday,String major,int semester) 
	{
		super(ma, hoTen, soDienThoai, birthday);
		setMajor(major);
		setSemester(semester);
	}
	public String toString()
	{
		return String.format("%s Chuyên ngành:%s Học kì:%d",super.toString(),major,semester);
	}
	
}

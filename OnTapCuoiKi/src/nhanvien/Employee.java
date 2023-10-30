package nhanvien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Employee 
{
	/**
	 * @return the hoTen
	 */
	public FullName getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(FullName hoTen) {
		this.hoTen = hoTen;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ma);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ma, other.ma);
	}
	/**
	 * @return the ma
	 */
	public String getMa() {
		return ma;
	}
	/**
	 * @param ma the ma to set
	 */
	public void setMa(String ma) 
	{
		if(ma.trim().equals(""))
			this.ma="NULL";
		else
			this.ma = ma;
	}
	
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai)
	{
		char kiTuDau=soDienThoai.charAt(0);
		if(soDienThoai.length()!=10||kiTuDau!='0')
			this.soDienThoai="NULL";
		else
			this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the birthday
	 */
	public LocalDate getBirthday()
	{
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(LocalDate birthday)
	{
		if(LocalDate.now().getYear()-birthday.getYear()>=20)
			this.birthday = birthday;
		else
			this.birthday=LocalDate.now();
	}
	protected String ma,soDienThoai;
	protected LocalDate birthday;
	protected FullName hoTen;
	public Employee(String ma,FullName hoTen, String soDienThoai,LocalDate birthday)
	{
		setMa(ma);
		setHoTen(hoTen);
		setSoDienThoai(soDienThoai);
		setBirthday(birthday);
	}
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public String toString()
	{
		return String.format("%-5s %-30s %-20s %-10s",ma,hoTen.toString(),soDienThoai,dtf.format(birthday));
	}
}

package nhanvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListEmployee
{
	/**
	 * @return the list
	 */
	public ArrayList<Employee> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Employee> list) {
		this.list = list;
	}

	private ArrayList<Employee> list;
	public ListEmployee()
	{
		setList(new ArrayList<Employee>());
	}
	public boolean them(Employee e)
	{
		if(!list.contains(e))
		{
			list.add(e);
			return true;
		}
		return false;
	}
	public String layTieuDe()
	{
		return String.format("%-5s %-30s %-20s %-10s","Mã ID","Họ tên","Số điện thoại","Birthday");
	}
	public String toString()
	{
		String s="";
		for(Employee e:list)
		{
			s+=e.toString()+"\n";
		}
		return s;
	}
	public boolean sua(String ma, LocalDate ngaySinh)
	{
		for(Employee e:list)
		{
			if(e.getMa().equalsIgnoreCase(ma))
			{
				e.setBirthday(ngaySinh);
				return true;
			}		
		}
		return false;
	}
	public String layDsNVKinhNghiem5Nam()
	{
		String s="";
		for(Employee e:list)
		{
			if(e instanceof Experience)
			{
				if(((Experience) e).getExpInYear()>5)
					s+=e.toString()+"\n";
			}
		}
		return s;
	}
	public void sortTheoTen()
	{
		Collections.sort(list,new Comparator<Employee>()
		{
			public int compare(Employee o1,Employee o2)
			{
				return o1.getHoTen().getLastName().compareToIgnoreCase(o2.getHoTen().getLastName());
			}
		});
	}
}

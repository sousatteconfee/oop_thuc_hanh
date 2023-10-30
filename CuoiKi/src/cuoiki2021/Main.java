package cuoiki2021;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) 
	{
		ListGiaoDich list=new ListGiaoDich();
		list.add(new GiaoDichDaQuy("A001", LocalDate.of(2019,12,3), 100000000.3,"Kim cương",100));
		list.add(new GiaoDichDaQuy("A002", LocalDate.of(2019,12,3), 200000000,"Cẩm Thạch",100));
		list.add(new GiaoDichVang("A003", LocalDate.of(2019,12,4), 300000000, "9999",200,"Vàng"));
		list.add(new GiaoDichVang("A004", LocalDate.of(2019,12,5), 300000000, "999",200,"Vàng"));
		list.add(new GiaoDichVang("A005", LocalDate.of(2019,12,6), 400000000, "99",200,"Vàng"));
		list.xuatGiaoDich();
	}
}

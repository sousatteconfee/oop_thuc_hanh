package sourcecode.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0VND");
		GiaoDich[] gd = new GiaoDich[3];
		gd[0] = new GiaoDich("12312", LocalDate.of(2012, 10, 19), 1200000000, 2);
		gd[1] = new GiaoDich("22222", LocalDate.of(2013, 11, 20), 120000, 3);
		gd[2] = new GiaoDich("33333", LocalDate.of(2014, 11, 21), 120000, 4);
		
		GiaoDichVang[] g = new GiaoDichVang[3];
		g[0] = new GiaoDichVang("44444", LocalDate.of(2020, 8, 12), 2000000000, 3, "9999");
		g[1] = new GiaoDichVang("55555", LocalDate.of(2020, 8, 13), 2000000000, 5, "7777");
		g[2] = new GiaoDichVang("66666", LocalDate.of(2020, 8, 14), 400000000, 3, "8888");
		
		GiaoDichTienTe[] d = new GiaoDichTienTe[3];
		d[0] = new GiaoDichTienTe("7777", LocalDate.of(2019, 5, 7), 1000000000, 4, 12.5, LoaiTienTe.VND);
		d[1] = new GiaoDichTienTe("8888", LocalDate.of(2019, 5, 8), 500000000, 4, 13.5, LoaiTienTe.Euro);
		d[2] = new GiaoDichTienTe("1111", LocalDate.of(2019, 5, 9), 700000, 4, 14.5, LoaiTienTe.USD);
		
		int soGDthuong = 0;
		int soGDVang = 0;
		int soGDTienTe = 0;
		double tongTienGDTienTe =0;
		for(int i=0;i<3;i++)
		{
				soGDthuong+=gd[i].getSoLuong();
		
				soGDVang+=g[i].getSoLuong();
	
				soGDTienTe+=d[i].getSoLuong();
				if( d[i].getLoaiTienTe()==(LoaiTienTe.Euro) || d[i].getLoaiTienTe()==(LoaiTienTe.USD))
				{
					tongTienGDTienTe += d[i].tinhThanhTien()/d[i].getTiGia();
				}
				else
				{
					tongTienGDTienTe += d[i].tinhThanhTien();
				}
		}
		System.out.println("Số giao dịch thường = "+soGDthuong);
		System.out.println("Số giao dịch Vàng = "+ soGDVang);
		System.out.println("Số giao dịch tiền tệ = "+soGDTienTe);
		System.out.println("Trung bình thành tiền của giao dịch tiền tệ đã đổi qua tiền việt nam: "+df.format(tongTienGDTienTe/soGDthuong ));
		
		for(int i = 0;i<3;i++)
		{
			if(gd[i].getDonGia()>=1000000000)
				System.out.println(gd[i].toString());
			else if(g[i].getDonGia()>=1000000000)
				System.out.println(g[i].toString());
			else if(d[i].getDonGia()>=1000000000)
				System.out.println(d[i].toString());
		}
			
	}

}

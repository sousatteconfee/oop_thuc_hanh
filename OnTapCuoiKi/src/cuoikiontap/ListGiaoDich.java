package cuoikiontap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListGiaoDich 
{
	private ArrayList<GiaoDich> dsGiaoDich;
	public ListGiaoDich()
	{
		super();
		dsGiaoDich=new ArrayList<GiaoDich>();
	}
	public void add(GiaoDich gd)
	{
		if(!dsGiaoDich.contains(gd))
		{
			dsGiaoDich.add(gd);
		}
		else
		{
			System.out.println("Dữ liệu giao dịch đã tồn tại\n");
		}
	}
	public void xuatGiaoDich()
	{
		System.out.println("Xuất danh sách giao dịch:");
		for(GiaoDich gd:dsGiaoDich)
		{
			System.out.println(gd.toString());
		}
	}
	public GiaoDich timKiemTheoMa(String maCanTim)
	{
		for (GiaoDich gd: dsGiaoDich) 
		{
			if(gd.getMaGiaoDich().equalsIgnoreCase(maCanTim))
				return gd;// tim thay
		}
		return null;// khong thay	
	}
	public void xoaTheoMaHang(String maCanXoa)
	{
		GiaoDich gd= timKiemTheoMa(maCanXoa);
		if(gd!=null)// thay di xoa
		{
			dsGiaoDich.remove(gd);
			System.out.println("Xoá thành công\n");
		}
		else
			System.out.println("Xoá không thành công\n");
	}
	public void sapXepTheoMaTangDan()
	{
		System.out.println("Danh sách giao dịch được sắp xếp theo mã:");
		Collections.sort(dsGiaoDich, new Comparator<GiaoDich>() 
		{
			@Override
			public int compare(GiaoDich o1, GiaoDich o2) 
			{
				// TODO Auto-generated method stub
				return o1.getMaGiaoDich().compareToIgnoreCase(o2.getMaGiaoDich());
			}
		});
		xuatGiaoDich();
	}
	public void xuatGiaoDich2512()
	{
		System.out.println("Danh sách giao dịch 25/12/2021:");
		for(GiaoDich gd:dsGiaoDich)
		{
			if(gd.getNgayGiaoDich()==LocalDate.of(2021,12,25))
				System.out.println(gd.toString());
		}
	}
}

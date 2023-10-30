package cuoiki2021;

import java.time.LocalDate;

public class GiaoDichDaQuy extends GiaoDich
{
	/**
	 * @return the soCarat
	 */
	public int getSoCarat() {
		return soCarat;
	}
	/**
	 * @param soCarat the soCarat to set
	 */
	public void setSoCarat(int soCarat) 
	{
		if(soCarat<0)
			this.soCarat=0;
		else
			this.soCarat = soCarat;
	}
	private int soCarat;
	public GiaoDichDaQuy(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loai,int soCarat)
	{
		super(maGiaoDich, ngayGiaoDich, donGia, loai);
		// TODO Auto-generated constructor stub
		setSoCarat(soCarat);
	}
	@Override
	public double getThanhTien() 
	{
		if(loai=="Kim cương")
			return getSoCarat()*getDonGia()+0.3*getSoCarat()*getDonGia();
		if(loai=="Cẩm thạch")
			return getSoCarat()*getDonGia()+0.1*getSoCarat()*getDonGia();
		else
			return 0;
	}
	public String toString()
	{
		return String.format("%s Số carat:%d Thành tiền:%f",super.toString(),soCarat,getThanhTien());
	}
	
	
}

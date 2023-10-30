package cuoiki2021;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich
{
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}

	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong)
	{
		if(soLuong<=0)
			this.soLuong=0;
		else
			this.soLuong = soLuong;
	}

	/**
	 * @return the donViTinh
	 */
	public String getDonViTinh() {
		return donViTinh;
	}

	/**
	 * @param donViTinh the donViTinh to set
	 */
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	private int soLuong;
	private String donViTinh;
	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loai,int soLuong,String donViTinh)
	{
		super(maGiaoDich, ngayGiaoDich, donGia, loai);
		setSoLuong(soLuong);
		setDonViTinh(donViTinh);
	}

	@Override
	public double getThanhTien()
	{
		if(loai=="9999")
			return getSoLuong()*getDonGia()+0.1* getSoLuong()*getDonGia();
		if(loai=="999")
			return getSoLuong()*getDonGia()+0.05* getSoLuong()*getDonGia();
		if(loai=="99")
			return getSoLuong()*getDonGia();
		else
			return 0;
	}
	public String toString()
	{
		return String.format("%s Số Lượng:%d Thành tiền:%f",super.toString(),soLuong,getThanhTien());
	}

}

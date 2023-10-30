package cuoikiontap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class GiaoDich 
{
	@Override
	public int hashCode() {
		return Objects.hash(maGiaoDich);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGiaoDich, other.maGiaoDich);
	}
	/**
	 * @return the loai
	 */
	public String getLoai() 
	{
		return loai;
	}
	/**
	 * @param loai the loai to set
	 */
	public void setLoai(String loai)
	{
		if(loai.trim().equals(""))
			this.loai="NULL";
		else
			this.loai = loai;
	}
	public String getMaGiaoDich() 
	{
		return maGiaoDich;
	}
	/**
	 * @param maGiaoDich the maGiaoDich to set
	 */
	public void setMaGiaoDich(String maGiaoDich) 
	{
		if(maGiaoDich.trim().equals(""))
			this.maGiaoDich="NULL";
		else
			this.maGiaoDich = maGiaoDich;
	}
	/**
	 * @return the ngayGiaoDich
	 */
	public LocalDate getNgayGiaoDich()
	{
		return ngayGiaoDich;
	}
	/**
	 * @param ngayGiaoDich the ngayGiaoDich to set
	 */
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) 
	{
		this.ngayGiaoDich = ngayGiaoDich;
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia()
	{
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) 
	{
		if(donGia<=0)
			this.donGia=0;
		else
			this.donGia = donGia;
	}
	protected String maGiaoDich,loai;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public GiaoDich(String maGiaoDich,LocalDate ngayGiaoDich,double donGia,String loai)
	{
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setLoai(loai);
	}
	public String toString()
	{
		return String.format("Mã giao dịch:%s Ngày giao dịch:%s Đơn giá:%f Loại:%s",maGiaoDich,dtf.format(ngayGiaoDich),donGia,loai);
	}
	public abstract double getThanhTien();
}

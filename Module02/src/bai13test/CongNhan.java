package bai13test;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSP;
	private int maCN;

	public CongNhan(String mHo, String mTen, int mSoSP,int maCN) {
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
		this.maCN = maCN;
	}

	public CongNhan() {
		this.mHo = "";
		this.mTen = "";
		this.mSoSP = 0;
		this.maCN = 0;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	

	public int getMaCN() {
		return maCN;
	}

	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}

	public double tinhLuong() {
		double luong = 0;
		double donGia = 0.5;
		if (this.mSoSP >= 1 && this.mSoSP <= 199) {
			donGia = 0.5;
			luong += this.mSoSP * donGia;
		} else if (this.mSoSP >= 200 && this.mSoSP <= 399) {
			donGia = 0.55;
			luong += this.mSoSP * donGia;
		} else if (this.mSoSP >= 400 && this.mSoSP <= 599) {
			donGia = 0.6;
			luong += this.mSoSP * donGia;
		} else {
			donGia = 0.6;
			luong += this.mSoSP * donGia;
		}

		return luong;

	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %17d %17d",this.mHo,this.mTen,this.mSoSP,this.maCN);
	}

	
}

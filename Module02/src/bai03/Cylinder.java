package bai03;

public class Cylinder {
	private double BanKinh;
	private double ChieuCao;
	
	public double getBanKinh() {
		return BanKinh;
	}
	public void setBanKinh(double banKinh) {
		this.BanKinh = banKinh;
	}
	public double getChieuCao() {
		return ChieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.ChieuCao = chieuCao;
	}
	public Cylinder() {
		this.BanKinh=1;
		this.ChieuCao=2;
	}
	public Cylinder(double banKinh, double chieuCao) {
		setBanKinh(banKinh);
		setChieuCao(chieuCao);
	}
	public double dienTichXungQuanh() {
		return 2*Math.PI*this.BanKinh * this.ChieuCao;
	}
	public double dienTichToanPhan() {
		return 2*Math.PI*this.BanKinh * this.BanKinh+this.ChieuCao;
	}
	public double theTich() {
		return Math.PI*Math.pow(this.BanKinh, 2) * this.ChieuCao;
	}
	@Override
	public String toString() {
		return "Ban Kinh= " + this.BanKinh + "Chieu Cao= " + this.ChieuCao;
	}
	
	
	
	
	
	
}

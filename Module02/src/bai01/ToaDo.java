package bai01;

public class ToaDo{
	private double x;
	private double y;
	private String name;
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setTenToaDo(String ten) {
		this.name = name;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String getTenToaDo() {
		return name;
	}
	
	public ToaDo() {
		this.x = 0;
		this.y = 0;
		this.name = "O";
		
	}
	
	public ToaDo(double x, double y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name+"("+ this.x + "," + this.y +")";
	}

	public String getThongTin() {
		return this.name+"("+ this.x + ", " + this.y +")";
	}
}
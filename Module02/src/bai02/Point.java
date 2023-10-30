package bai02;

public class Point {
	private double X;
	private double Y;
	
	public double getX() {
		return X;
	}
	
	public void setX(double x) {
		X = x;
	}
	
	public double getY() {
		return Y;
	}
	
	public void setY(double y) {
		Y = y;
	}

	public Point() {
		this.X=0;
		this.Y=0;
	}

	public Point(double x, double y) {
		X = x;
		Y = y;
	}

	@Override
	public String toString() {
		return "Point [X=" + X + ", Y=" + Y + "]";
	}
	
	public Point nagate() {
		Point ddx=new Point(X, Y);
		return ddx;
	}
	
	public double getDistance() {
		return Math.sqrt(Math.pow(this.X, 2) + Math.pow(this.Y, 2));
	}

	
	
	
	
	
	
	
}
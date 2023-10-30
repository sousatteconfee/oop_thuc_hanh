package bai02;

public class TestPoint {
	
	public static void main(String[] args) {
		
		Point p=new Point(1, 2);
	
		System.out.println("Diem doi xung= " + p.nagate());
		System.out.println("Khoang cach toa do= " + p.getDistance());
	}

}

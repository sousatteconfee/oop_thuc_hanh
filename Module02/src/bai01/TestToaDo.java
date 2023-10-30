package bai01;

public class TestToaDo {
	
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 10, "B");
		
		td1.setX(1);
		System.out.println("Gan x=1: " + td1 + ";");
		td1.setY(2);
		System.out.println("Gan y=2: " + td1 + ";");
	}
}

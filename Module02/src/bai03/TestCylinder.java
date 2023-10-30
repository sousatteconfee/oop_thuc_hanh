package bai03;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder c=new Cylinder(1, 2);
			
		System.out.println("Dien Tich Xung Quanh = " + c.dienTichXungQuanh());
		System.out.println("Dien Tich Toan Phan = " + c.dienTichToanPhan());
		System.out.println("The Tich = " + c.theTich());
	}
}

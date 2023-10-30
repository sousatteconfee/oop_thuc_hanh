package bai14test;


import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        try {
			Scanner sc = new Scanner(System.in);
			Order h = new Order(LocalDate.of(2022, 7, 10), 1);
		    h.addLineItems(new Product("Nuoc tuong","sp4",8000) , 10);
		    h.addLineItems(new Product("Gao","sp1",18000), 5);
		    h.addLineItems(new Product("Duong","sp3",10000),1);
		    h.addLineItems(new Product("Gao","sp1",18000), 1);
		    
			System.out.println(h.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

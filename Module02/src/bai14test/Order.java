package bai14test;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;

public class Order {
	
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;

	public Order(LocalDate orderDate, int orderID) {
	    setOrderDate(orderDate);
		this.orderID = orderID;
		this.count = 0;
		this.lineItems = new OrderDetail[20];
	}

	public int getOrderID() {
		return orderID;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public OrderDetail[] getLineItems() {
		return lineItems;
	}

	public void setOrderDate(LocalDate orderDate) {
		if (orderDate.isBefore(LocalDate.now()))
			this.orderDate = orderDate;
		else
			this.orderDate = LocalDate.now();
	}

	public void addLineItems(Product p, int x) throws Exception {
		if (count < 20) {
			lineItems[count++] = new OrderDetail(p, x);
		} else
			throw new Exception("Lỗi: order vượt quá số lượng tối đa cho phép!");
	}

	public double calcTotalCharge() {
		double kq = 0;
		for (int i = 0; i < count; i++) {
			kq += lineItems[i].calcTotalPrice();
		}
		return kq;
	}

	public static String getTieuDe() {
		return String.format("%10s | %-15s | %-15s | %15s | %15s | %15s |\n", "STT", "Ma SP", "Mo ta", "Don gia",
				"So Luong", "Thanh Tien");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String s = "";
		s += String.format("Ma HD: %d\n", this.orderID);
		s += String.format("Ngay lap hoa don: %s\n", dtf.format(orderDate));
		s += getTieuDe();
		for (int i = 0; i < count; i++) {
			s += String.format("%10d %s", i + 1, lineItems[i].toString());
			s += "\n";
		}
		s += String.format("Tong tien thanh toan: %s", df.format(calcTotalCharge()));
		return s;
	}

}

package bai14test;

import java.text.DecimalFormat;

public class Product {
	
	private String description;
	private String productID;
	private double price;

	public Product(String description, String productID, double price) {
		setDescription(description);
		setProductID(productID);
		setPrice(price);
	}

	public Product() {
		this.description = " ";
		this.productID = " ";
		this.price = 0;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (!description.trim().equals(""))
			this.description = description;
		else
			this.description = " ";
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		if (!productID.trim().equals(""))
			this.productID = productID;
		else
			this.productID = " ";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 0;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("| %-15s | %-15s | %15s |", this.productID, this.description, df.format(price));
	}

}

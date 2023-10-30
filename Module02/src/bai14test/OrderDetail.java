package bai14test;

import java.text.DecimalFormat;

public class OrderDetail {
	private int quality;
	private Product product;

	public OrderDetail(Product product, int quality) {
		setQuality(quality);
		this.product = product;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		if (quality > 0)
			this.quality = quality;
		else
			this.quality = 0;
	}

	public double calcTotalPrice() {
		return quality * product.getPrice();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0 VND");
		return String.format("%s %15d | %15s |", this.product.toString(), this.quality, df.format(calcTotalPrice()));
	}

}

package entity;

import java.math.BigDecimal;

public class Price {
	 private int priceId;
	 private BigDecimal price;
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Price(int priceId, BigDecimal price) {
		super();
		this.priceId = priceId;
		this.price = price;
	}
	public Price() {
		super();
	}
	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", price=" + price + "]";
	}
	
	 
}

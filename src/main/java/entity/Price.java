package entity;

import java.math.BigDecimal;

public class Price {
	 private int priceId;
	 private BigDecimal price;
	 private int detailId;
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
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", price=" + price + ", detailId=" + detailId + "]";
	}
	public Price(int priceId, BigDecimal price, int detailId) {
		super();
		this.priceId = priceId;
		this.price = price;
		this.detailId = detailId;
	}
	public Price() {
		super();
	}
	 
	 
}

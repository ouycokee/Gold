package entity;

import java.math.BigDecimal;

public class OrderDetails {
	  private int detailId;
	  private int orderId;
	  private int specId;
	  private int quantity;
	  private BigDecimal price;
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getSpecId() {
		return specId;
	}
	public void setSpecId(int specId) {
		this.specId = specId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public OrderDetails(int detailId, int orderId, int specId, int quantity, BigDecimal price) {
		super();
		this.detailId = detailId;
		this.orderId = orderId;
		this.specId = specId;
		this.quantity = quantity;
		this.price = price;
	}
	public OrderDetails() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetails [detailId=" + detailId + ", orderId=" + orderId + ", specId=" + specId + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	  
	  
}

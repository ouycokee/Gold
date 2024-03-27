package entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Order {
    private int orderId;
    private int userId;
    private BigDecimal totalPrice;
    private int status;
    private Date createTime;
    private String address;
    private String phone;
    private Date deliveryTime;
    private String note;
    
    
	public Order(int orderId, int userId, BigDecimal totalPrice, int status, Date createTime, String address,
			String phone, Date deliveryTime, String note) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.status = status;
		this.createTime = createTime;
		this.address = address;
		this.phone = phone;
		this.deliveryTime = deliveryTime;
		this.note = note;
	}


	public Order() {
		super();
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public BigDecimal getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getDeliveryTime() {
		return deliveryTime;
	}


	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", totalPrice=" + totalPrice + ", status=" + status
				+ ", createTime=" + createTime + ", address=" + address + ", phone=" + phone + ", deliveryTime="
				+ deliveryTime + ", note=" + note + "]";
	}
    
    
    
}

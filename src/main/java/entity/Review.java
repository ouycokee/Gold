package entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Review {
	 private int reviewId;
	 private int orderId;
	 private int productId;
	 private int rating;
	 private String content;
	 private Date createTime;
	 private int order_id;
	 private int userId;
	 private BigDecimal totalPrice;
	 private int status;
	 private Date ordercreateTime;
	 private String address;
	 private String phone;
	 private Date deliveryTime;
	 private String note;
	 private int proId;
	 private String proName;
	 private int cateId;
	 private int proStatus;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
	public Date getOrdercreateTime() {
		return ordercreateTime;
	}
	public void setOrdercreateTime(Date ordercreateTime) {
		this.ordercreateTime = ordercreateTime;
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
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public int getProStatus() {
		return proStatus;
	}
	public void setProStatus(int proStatus) {
		this.proStatus = proStatus;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", orderId=" + orderId + ", productId=" + productId + ", rating="
				+ rating + ", content=" + content + ", createTime=" + createTime + "]";
	}
	
	
	
	public Review(int reviewId, int orderId, int productId, int rating, String content, Date createTime, int order_id,
			int userId, BigDecimal totalPrice, int status, Date ordercreateTime, String address, String phone,
			Date deliveryTime, String note, int proId, String proName, int cateId, int proStatus) {
		super();
		this.reviewId = reviewId;
		this.orderId = orderId;
		this.productId = productId;
		this.rating = rating;
		this.content = content;
		this.createTime = createTime;
		this.order_id = order_id;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.status = status;
		this.ordercreateTime = ordercreateTime;
		this.address = address;
		this.phone = phone;
		this.deliveryTime = deliveryTime;
		this.note = note;
		this.proId = proId;
		this.proName = proName;
		this.cateId = cateId;
		this.proStatus = proStatus;
	}
	public Review() {
		super();
	}
	 
	 
}

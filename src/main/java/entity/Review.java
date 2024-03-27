package entity;

import java.sql.Date;

public class Review {
	 private int reviewId;
	 private int orderId;
	 private int productId;
	 private int rating;
	 private String content;
	 private Date createTime;
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
	public Review(int reviewId, int orderId, int productId, int rating, String content, Date createTime) {
		super();
		this.reviewId = reviewId;
		this.orderId = orderId;
		this.productId = productId;
		this.rating = rating;
		this.content = content;
		this.createTime = createTime;
	}
	public Review() {
		super();
	}
	 
	 
}

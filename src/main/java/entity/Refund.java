package entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Refund {
	 private int refundId;
	 private int orderId;
	 private String reason;
	 private BigDecimal amount;
	 private String status;
	 private Date createTime;
	 private int dd_orderId;
	 private int dd_userId;
	 private BigDecimal dd_totalDecimal;
	 
	public int getDd_orderId() {
		return dd_orderId;
	}
	public void setDd_orderId(int dd_orderId) {
		this.dd_orderId = dd_orderId;
	}
	public int getDd_userId() {
		return dd_userId;
	}
	public void setDd_userId(int dd_userId) {
		this.dd_userId = dd_userId;
	}
	public BigDecimal getDd_totalDecimal() {
		return dd_totalDecimal;
	}
	public void setDd_totalDecimal(BigDecimal dd_totalDecimal) {
		this.dd_totalDecimal = dd_totalDecimal;
	}
	public int getRefundId() {
		return refundId;
	}
	public void setRefundId(int refundId) {
		this.refundId = refundId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Refund [refundId=" + refundId + ", orderId=" + orderId + ", reason=" + reason + ", amount=" + amount
				+ ", status=" + status + ", createTime=" + createTime + "]";
	}
	
	public Refund(int refundId, int orderId, String reason, BigDecimal amount, String status, Date createTime,
			int dd_orderId, int dd_userId, BigDecimal dd_totalDecimal) {
		super();
		this.refundId = refundId;
		this.orderId = orderId;
		this.reason = reason;
		this.amount = amount;
		this.status = status;
		this.createTime = createTime;
		this.dd_orderId = dd_orderId;
		this.dd_userId = dd_userId;
		this.dd_totalDecimal = dd_totalDecimal;
	}
	public Refund() {
		super();
	}
	 
	 
}

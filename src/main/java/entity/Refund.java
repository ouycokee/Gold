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
	public Refund(int refundId, int orderId, String reason, BigDecimal amount, String status, Date createTime) {
		super();
		this.refundId = refundId;
		this.orderId = orderId;
		this.reason = reason;
		this.amount = amount;
		this.status = status;
		this.createTime = createTime;
	}
	public Refund() {
		super();
	}
	 
	 
}

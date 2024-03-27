package entity;

import java.sql.Timestamp;

public class OrdersManager {
	private int omId;
    private int orderId;
    private Timestamp operationTime;
    private int adminId;
    private String operationType;
    private String note;
	public int getOmId() {
		return omId;
	}
	public void setOmId(int omId) {
		this.omId = omId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Timestamp getOperationTime() {
		return operationTime;
	}
	public void setOperationTime(Timestamp operationTime) {
		this.operationTime = operationTime;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "OrdersManager [omId=" + omId + ", orderId=" + orderId + ", operationTime=" + operationTime
				+ ", adminId=" + adminId + ", operationType=" + operationType + ", note=" + note + "]";
	}
	public OrdersManager(int omId, int orderId, Timestamp operationTime, int adminId, String operationType,
			String note) {
		super();
		this.omId = omId;
		this.orderId = orderId;
		this.operationTime = operationTime;
		this.adminId = adminId;
		this.operationType = operationType;
		this.note = note;
	}
	public OrdersManager() {
		super();
	}
    
    
}

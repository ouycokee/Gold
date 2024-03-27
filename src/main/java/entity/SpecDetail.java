package entity;

public class SpecDetail {
	 private int detailId;
	 private int specId;
	 private String detail;
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public int getSpecId() {
		return specId;
	}
	public void setSpecId(int specId) {
		this.specId = specId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "SpecDetail [detailId=" + detailId + ", specId=" + specId + ", detail=" + detail + "]";
	}
	public SpecDetail(int detailId, int specId, String detail) {
		super();
		this.detailId = detailId;
		this.specId = specId;
		this.detail = detail;
	}
	public SpecDetail() {
		super();
	}
	 
	 
}

package entity;

public class Combination {
	 private int combinationId;
	 private int priceId;
	 private int detailId;
	public int getCombinationId() {
		return combinationId;
	}
	public void setCombinationId(int combinationId) {
		this.combinationId = combinationId;
	}
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	@Override
	public String toString() {
		return "Combination [combinationId=" + combinationId + ", priceId=" + priceId + ", detailId=" + detailId + "]";
	}
	public Combination(int combinationId, int priceId, int detailId) {
		super();
		this.combinationId = combinationId;
		this.priceId = priceId;
		this.detailId = detailId;
	}
	public Combination() {
		super();
	}
	 
	 
}

package entity;

public class Favorites {
	   private int favoriteId;
	   private int orderId;
	   private int productId;
	public int getFavoriteId() {
		return favoriteId;
	}
	public void setFavoriteId(int favoriteId) {
		this.favoriteId = favoriteId;
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
	@Override
	public String toString() {
		return "Favorites [favoriteId=" + favoriteId + ", orderId=" + orderId + ", productId=" + productId + "]";
	}
	public Favorites(int favoriteId, int orderId, int productId) {
		super();
		this.favoriteId = favoriteId;
		this.orderId = orderId;
		this.productId = productId;
	}
	public Favorites() {
		super();
	}
	   
}

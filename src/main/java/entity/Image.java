package entity;

public class Image {
    public Image(String imageUrl) {
		super();
		this.imageUrl = imageUrl;
	}

	private int imageId;
    private String imageUrl;
    private int proId;

    public Image() {
    }

    public Image(int imageId, String imageUrl, int proId) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.proId = proId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl + ", proId=" + proId + "]";
	}
}
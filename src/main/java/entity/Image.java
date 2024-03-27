package entity;

public class Image {
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
}
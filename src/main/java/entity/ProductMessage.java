package entity;

import java.math.BigDecimal;

public class ProductMessage {
  

	public ProductMessage(int proId, String proName, int categoryId, int proStatus) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
	}

	private int proId;  
    private String proName;  
    private int categoryId;  
    private int proStatus;
    
    
    private String detail;
    private String imageUrl;
	private BigDecimal price;
	private int count;

    public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDetail() {
		return detail;
	}

	public ProductMessage(int proId, String proName, String imageUrl, BigDecimal price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.imageUrl = imageUrl;
		this.price = price;
	}

	public ProductMessage(int count) {
		super();
		this.count = count;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ProductMessage(String detail) {
		super();
		this.detail = detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProStatus() {
        return proStatus;
    }

    public void setProStatus(int proStatus) {
        this.proStatus = proStatus;
    }

 

    @Override
	public String toString() {
		return "ProductMessage [proId=" + proId + ", proName=" + proName + ", categoryId=" + categoryId + ", proStatus="
				+ proStatus + ", detail=" + detail + "]";
	}
    

    public ProductMessage(int proId, String proName, int categoryId, int proStatus, String detail) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
		this.detail = detail;
	}
	public ProductMessage(int proId, String detail) {
		super();
		this.proId = proId;
		this.detail = detail;
	}

	public ProductMessage() {
        super();
    }  
}

package entity;

public class ProductMessage {  
	  

    private int proId;  
  

    private String proName;  
  

    private String proDetail;  
  

    private int categoryId;  
  

    private int proStatus;  
  

  

    public ProductMessage() {  
    }  

    public ProductMessage(String proName, String proDetail, Integer categoryId, Integer proStatus) {  
        this.proName = proName;  
        this.proDetail = proDetail;  
        this.categoryId = categoryId;  
        this.proStatus = proStatus;  
    }  
  

    public Integer getProId() {  
        return proId;  
    }  
  
    public void setProId(Integer proId) {  
        this.proId = proId;  
    }  
  
    public String getProName() {  
        return proName;  
    }  
  
    public void setProName(String proName) {  
        this.proName = proName;  
    }  
  
    public String getProDetail() {  
        return proDetail;  
    }  
  
    public void setProDetail(String proDetail) {  
        this.proDetail = proDetail;  
    }  
  
    public Integer getCategoryId() {  
        return categoryId;  
    }  
  
    public void setCategoryId(Integer categoryId) {  
        this.categoryId = categoryId;  
    }  
  
    public Integer getProStatus() {  
        return proStatus;  
    }  
  
    public void setProStatus(Integer proStatus) {  
        this.proStatus = proStatus;  
    }  
  

  
    @Override  
    public String toString() {  
        return "ProductMessage{" +  
                "proId=" + proId +  
                ", proName='" + proName + '\'' +  
                ", proDetail='" + proDetail + '\'' +  
                ", categoryId=" + categoryId +  
                ", proStatus=" + proStatus +  
                '}';  
    }  
}

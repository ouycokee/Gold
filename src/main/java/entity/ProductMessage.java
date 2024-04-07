package entity;

public class ProductMessage {  
	  

    private int proId;  
  

    private String proName;  
  

    private int categoryId;  
  

    private int proStatus;


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
				+ proStatus + "]";
	}


	public ProductMessage(int proId, String proName, int categoryId, int proStatus) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
	}


	public ProductMessage() {
		super();
		// TODO Auto-generated constructor stub
	}  
  

}

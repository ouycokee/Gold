package entity;


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
<<<<<<< HEAD
  

=======
>>>>>>> branch 'master' of git@github.com:ouycokee/Gold.git
    private int categoryId;  
    private int proStatus;
    
    
    private String detail;

<<<<<<< HEAD
    private int proStatus;  
  
    private int Cate_id;
    
    private String Cate_name;
  
=======
    public String getDetail() {
		return detail;
	}

	public ProductMessage(String detail) {
		super();
		this.detail = detail;
	}
>>>>>>> branch 'master' of git@github.com:ouycokee/Gold.git

	public void setDetail(String detail) {
		this.detail = detail;
	}

<<<<<<< HEAD
    
    
=======
	public int getProId() {
        return proId;
    }
>>>>>>> branch 'master' of git@github.com:ouycokee/Gold.git

<<<<<<< HEAD
    
=======
    public void setProId(int proId) {
        this.proId = proId;
    }
>>>>>>> branch 'master' of git@github.com:ouycokee/Gold.git

<<<<<<< HEAD
  
    public ProductMessage(int proId, String proName, int categoryId, int proStatus, int cate_id,
			String cate_name) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
		Cate_id = cate_id;
		Cate_name = cate_name;
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







	public int getCate_id() {
		return Cate_id;
	}







	public void setCate_id(int cate_id) {
		Cate_id = cate_id;
	}







	public String getCate_name() {
		return Cate_name;
	}







	public void setCate_name(String cate_name) {
		Cate_name = cate_name;
	}







	@Override  
    public String toString() {  
        return "ProductMessage{" +  
                "proId=" + proId +  
                ", proName='" + proName + '\'' +  
                ", categoryId=" + categoryId +  
                ", proStatus=" + proStatus +  
                '}';  
=======
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
>>>>>>> branch 'master' of git@github.com:ouycokee/Gold.git
    }  
}

package entity;


public class ProductMessage {
  

	private int proId;  
    private String proName;  
  

    private int categoryId;  
    private int proStatus;
    
    
    private String detail;

    private int Cate_id;
    
    private String Cate_name;

	public ProductMessage() {
		super();
	}
	
	
	public ProductMessage(int proId, String proName, int categoryId, int proStatus, int cate_id, String cate_name) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
		Cate_id = cate_id;
		Cate_name = cate_name;
	}


	public ProductMessage(String proName) {
		super();
		this.proName = proName;
	}

	
	
	public ProductMessage(int proId, String proName, int categoryId, int proStatus) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
	}


	public ProductMessage(int proId, String proName, int categoryId, int proStatus, String detail, int cate_id,
			String cate_name) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.categoryId = categoryId;
		this.proStatus = proStatus;
		this.detail = detail;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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
	
    
}

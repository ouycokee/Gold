package entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cart {  
    private int cid;  
    private int id;  
	private int ccount;  
	private BigDecimal cprice;  
	private int proid;  
	private String image;
	private String cname;
	private Date ctime;

    public Cart() {  
 
    }

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCcount() {
		return ccount;
	}

	public void setCcount(int ccount) {
		this.ccount = ccount;
	}

	public BigDecimal getCprice() {
		return cprice;
	}

	public void setCprice(BigDecimal cprice) {
		this.cprice = cprice;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Cart(int cid, int id, int ccount, BigDecimal cprice, int proid, String image, String cname, Date ctime) {
		super();
		this.cid = cid;
		this.id = id;
		this.ccount = ccount;
		this.cprice = cprice;
		this.proid = proid;
		this.image = image;
		this.cname = cname;
		this.ctime = ctime;
	}  
    
}

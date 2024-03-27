package entity;

import java.sql.Date;

public class Cart {  
	  
	 
    private int cid;  
  

    private int userid;  
  
     private int speId;  
  
       private int cartCount;  
     private Date cartTime;  
  
      public Cart() {  
 
    }  
  
    public Cart(Integer userid, Integer speId, Integer cartCount, Date cartTime) {  
        this.userid = userid;  
        this.speId = speId;  
        this.cartCount = cartCount;  
        this.cartTime = cartTime;  
    }  
  

    public Integer getCid() {  
        return cid;  
    }  
  
    public void setCid(Integer cid) {  
        this.cid = cid;  
    }  
  
    public Integer getUserid() {  
        return userid;  
    }  
  
    public void setUserid(Integer userid) {  
        this.userid = userid;  
    }  
  
    public Integer getSpeId() {  
        return speId;  
    }  
  
    public void setSpeId(Integer speId) {  
        this.speId = speId;  
    }  
  
    public Integer getCartCount() {  
        return cartCount;  
    }  
  
    public void setCartCount(Integer cartCount) {  
        this.cartCount = cartCount;  
    }  
  
    public Date getCartTime() {  
        return cartTime;  
    }  
  
    public void setCartTime(Date cartTime) {  
        this.cartTime = cartTime;  
    }  
  

    @Override  
    public String toString() {  
        return "CartEntity{" +  
                "cid=" + cid +  
                ", userid=" + userid +  
                ", speId=" + speId +  
                ", cartCount=" + cartCount +  
                ", cartTime=" + cartTime +  
                '}';  
    }  
}

package entity;



public class Address {  
  
      private int addId;  
  
     private int userId;  
  
      private String addName;  
  
       private String phone;  
  
        private String address;  
  
   
    public Address() {  
          }  
  
    public Address(Integer userId, String addName, String phone, String address) {  
        this.userId = userId;  
        this.addName = addName;  
        this.phone = phone;  
        this.address = address;  
    }  
  

    public Integer getAddId() {  
        return addId;  
    }  
  
    public void setAddId(Integer addId) {  
        this.addId = addId;  
    }  
  
    public Integer getUserId() {  
        return userId;  
    }  
  
    public void setUserId(Integer userId) {  
        this.userId = userId;  
    }  
  
    public String getAddName() {  
        return addName;  
    }  
  
    public void setAddName(String addName) {  
        this.addName = addName;  
    }  
  
    public String getPhone() {  
        return phone;  
    }  
  
    public void setPhone(String phone) {  
        this.phone = phone;  
    }  
  
    public String getAddress() {  
        return address;  
    }  
  
    public void setAddress(String address) {  
        this.address = address;  
    }  
  
    // toString
    @Override  
    public String toString() {  
        return "Address{" +  
                "addId=" + addId +  
                ", userId=" + userId +  
                ", addName='" + addName + '\'' +  
                ", phone='" + phone + '\'' +  
                ", address='" + address + '\'' +  
                '}';  
    }  
}
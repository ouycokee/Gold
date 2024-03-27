package entity;

import java.sql.Timestamp;

public class admin {
    private int adminId;
    private String adminName;
    private String adminPassword;
    private String adminContact;
    private int adminRole;
    private Timestamp adminCreateTime;

    public admin() {
    }

    public admin(int adminId, String adminName, String adminPassword, String adminContact, int adminRole, Timestamp adminCreateTime) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminContact = adminContact;
        this.adminRole = adminRole;
        this.adminCreateTime = adminCreateTime;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact;
    }

    public int getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(int adminRole) {
        this.adminRole = adminRole;
    }

    public Timestamp getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Timestamp adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }
}

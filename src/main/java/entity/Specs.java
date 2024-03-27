package entity;

public class Specs {
    private int speId;
    private int proId;
    private String speName;

    public Specs() {
    }

    public Specs(int speId, int proId, String speName) {
        this.speId = speId;
        this.proId = proId;
        this.speName = speName;
    }

    public int getSpeId() {
        return speId;
    }

    public void setSpeId(int speId) {
        this.speId = speId;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getSpeName() {
        return speName;
    }

    public void setSpeName(String speName) {
        this.speName = speName;
    }
}
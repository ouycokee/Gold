package entity;

public class Category {
	private int Cate_id;
	private String Cate_name;
	public Category() {
		super();
	}
	public Category(int cate_id, String cate_name) {
		super();
		Cate_id = cate_id;
		Cate_name = cate_name;
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

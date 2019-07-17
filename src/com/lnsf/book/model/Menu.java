package com.lnsf.book.model;

public class Menu {
	
	public Menu(int id, String name, int price, int rid, String mdescribe,
			int type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rid = rid;
		this.mdescribe = mdescribe;
		this.type = type;
	}
	private int id;
	private String name;
	private int price;
	private int rid;
	private String mdescribe;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getMDescribe() {
		return mdescribe;
	}
	public void setMDescribe(String mdescribe) {
		this.mdescribe = mdescribe;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", price=" + price
				+ ", rid=" + rid + ", mdescribe=" + mdescribe + ", type="
				+ type + "]";
	}
}

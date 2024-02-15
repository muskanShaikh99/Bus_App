package com.example.demo.dto;

//@lombok
public class Menu {
	private int menuId;
	private String name;
	private String type;
	private int price;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int menuId, String name, String type, int price) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	

}

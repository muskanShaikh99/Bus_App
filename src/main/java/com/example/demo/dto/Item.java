package com.example.demo.dto;

public class Item {
	private int itemId;
	private int menuId;
	private int quantity;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, int menuId, int quantity) {
		super();
		this.itemId = itemId;
		this.menuId = menuId;
		this.quantity = quantity;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", menuId=" + menuId + ", quantity=" + quantity + "]";
	}
	

}

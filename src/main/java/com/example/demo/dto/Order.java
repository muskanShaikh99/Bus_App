package com.example.demo.dto;
import java.util.List;
public class Order {
	private int orderId;
	private String customerName;
	private List<Item> fooditems;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String customerName, List<Item> fooditems) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.fooditems = fooditems;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Item> getFooditems() {
		return fooditems;
	}
	public void setFooditems(List<Item> fooditems) {
		this.fooditems = fooditems;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", fooditems=" + fooditems + "]";
	}
	
	

}

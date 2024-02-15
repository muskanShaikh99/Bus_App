package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private int orderId;

	private String customerName;

	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = "orderEntity")
	private List<ItemEntity> fooditems;

	public OrderEntity() {
		super();
	}

	public OrderEntity(int orderId, String customerName, List<ItemEntity> fooditems) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.fooditems = fooditems;
	}

	public OrderEntity(String customerName, List<ItemEntity> fooditems) {
		super();
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

	public List<ItemEntity> getFooditems() {
		return fooditems;
	}

	public void setFooditems(List<ItemEntity> fooditems) {
		this.fooditems = fooditems;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", customerName=" + customerName + ", fooditems=" + fooditems + "]";
	}

}

package com.example.demo.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "FOODITEMS")
public class ItemEntity {
	
	
	@Id
	@GeneratedValue
	private int itemId;
	
	private int menuId;
	private int quantity;
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id",referencedColumnName = "order_id")
	private OrderEntity orderEntity;

	public ItemEntity() {
		super();
	}

	public ItemEntity(int itemId, int menuId, int quantity, OrderEntity order) {
		super();
		this.itemId = itemId;
		this.menuId = menuId;
		this.quantity = quantity;
		this.orderEntity = order;
	}

	public ItemEntity(int menuId, int quantity, OrderEntity order) {
		super();
		this.menuId = menuId;
		this.quantity = quantity;
		this.orderEntity = order;
	}

	public ItemEntity(int menuId, int quantity) {
		super();
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

	public OrderEntity getOrder() {
		return orderEntity;
	}

	public void setOrder(OrderEntity order) {
		this.orderEntity = order;
	}

	@Override
	public String toString() {
		return "ItemEntity [itemId=" + itemId + ", menuId=" + menuId + ", quantity=" + quantity + ", order=" + orderEntity
				+ "]";
	}


}

package com.jeffstrunk.entities;

import javax.persistence.Entity;

import com.jeffstrunk.entities.Product;

@Entity
public class InventoryItem extends Product {

	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public InventoryItem(long id, String name, double salePrice) {
		super(id, name, salePrice);
	}

	public InventoryItem(long id, String name, double salePrice, int quantity) {
		super(id, name, salePrice);
		this.quantity = quantity;
	}

//	@Override
//	public String toString() {
//		return "InventoryItem [quantity=" + quantity + " SalePrice="
//				+ getSalePrice() + ", Id=" + getId() + ", Name=" + getName() 
//				+ "]";zaaaaaaaaa
//	}
	
	@Override
	public String toString() {
		return "Product [id=" + getId() + ", name=" + getName() + ", salePrice=" + getSalePrice() + ", quantity=" + getQuantity() + "]";
	}
	


	
	
}

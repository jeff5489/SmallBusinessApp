package com.jeffstrunk.entities;

import javax.persistence.Entity;

import com.jeffstrunk.entities.Product;

@Entity
public class SaleItem extends Product {
	
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public SaleItem(long id, String name, double salePrice, int quantity) {
		super(id, name, salePrice);
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "SaleItem [quantity=" + quantity + " "
				+ super.toString()
				+ "]";
	}


	
	

}

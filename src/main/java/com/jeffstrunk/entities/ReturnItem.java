package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class ReturnItem extends Product {
	
	private int quantity;

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public ReturnItem(int id, String name, double salePrice, int quantity) {
		super(id, name, salePrice);
		this.quantity = quantity;
	}
	
//	public ReturnItem(Date dateTimeOfTransaction, String customerID,ArrayList<SaleItem> productsOfTransaction) {
//		super(dateTimeOfTransaction, customerID, productsOfTransaction);
//		// TODO Auto-generated constructor stub
//	}
}

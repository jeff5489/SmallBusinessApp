package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class ReturnItems extends Transaction {

	public ReturnItems(Date dateTimeOfTransaction, String customerID,ArrayList<SaleItem> productsOfTransaction) {
		super(dateTimeOfTransaction, customerID, productsOfTransaction);
		// TODO Auto-generated constructor stub
	}

	
	
	

}

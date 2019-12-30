package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Transaction {
	
	@Id
	private int id;
	private Date dateTimeOfTransaction;
	private String customerID;
	
	@OneToMany
	private List<Product> productsOfTransaction = new ArrayList<Product>();
	private double transactionAmount;
	
//	public Transaction() {
//		super();
//	}

	public double getTransactionAmount() {
// calculate Transaction Amount
//		calculateTransactionAmount();
		return transactionAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Transaction(Date dateTimeOfTransaction, String customerID, ArrayList<Product> productsOfTransaction) {
		super();
		this.dateTimeOfTransaction = dateTimeOfTransaction;
		this.customerID = customerID;
		this.productsOfTransaction = productsOfTransaction;
	}

	public Date getDateTimeOfTransaction() {
		return dateTimeOfTransaction;
	}

	public void setDateTimeOfTransaction(Date dateTimeOfTransaction) {
		this.dateTimeOfTransaction = dateTimeOfTransaction;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public List<Product> getProductsOfTransaction() {
// calculate Transaction Amount
//		calculateTransactionAmount();
		return productsOfTransaction;
	}

	public void setProductsOfTransaction(ArrayList<Product> productsOfTransaction) {
		this.productsOfTransaction = productsOfTransaction;
	}
	
	public void addProductToProductsOfTransaction(Product product) {
		productsOfTransaction.add(product);
	}
	
	public void removeProductFromProductsOfTransaction(int id) {
		productsOfTransaction.remove(id);
	}

	@Override
	public String toString() {
		return "Transaction [dateTimeOfTransaction=" + dateTimeOfTransaction + ", customerID=" + customerID
				+ ", productsOfTransaction=" + productsOfTransaction + ", transactionAmount=" + transactionAmount + "]";
	}
	
//	private void calculateTransactionAmount() {
//		transactionAmount = productsOfTransaction.stream().mapToDouble(i -> i.getQuantity() * i.getSalePrice()).sum();
//	}
	
	
	
}

package com.jeffstrunk.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	
	@Id
	@Column(name = "transactionId")
	private String transactionId;
	@Column(name = "transactionDateTime")
	private LocalDateTime transactionDateTime;
	@Column(name = "customerId")
	private String customerId;
	@Column(name = "transactionAmount")
	private double transactionAmount;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Product> productsOfTransaction = new ArrayList<Product>();
	
	
	public Transaction() {
	}

	public double getTransactionAmount() {
// calculate Transaction Amount
//		calculateTransactionAmount();
		return transactionAmount;
	}

	public String getId() {
		return transactionId;
	}

	public void setId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Transaction(LocalDateTime dateTimeOfTransaction, String customerID, ArrayList<Product> productsOfTransaction) {
		super();
		this.transactionDateTime = dateTimeOfTransaction;
		this.customerId = customerID;
		this.productsOfTransaction = productsOfTransaction;
	}
	
	

	public Transaction(String id, LocalDateTime transactionDateTime, String customerID, List<Product> productsOfTransaction,
		double transactionAmount) {
		this.transactionId = id;
		this.transactionDateTime = transactionDateTime;
		this.customerId = customerID;
		this.productsOfTransaction = productsOfTransaction;
		this.transactionAmount = transactionAmount;
	}

	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public String getCustomerID() {
		return customerId;
	}

	public void setCustomerID(String customerID) {
		this.customerId = customerID;
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
		return "Transaction [transactionDateTime=" + transactionDateTime + ", customerID=" + customerId
				+ ", productsOfTransaction=" + productsOfTransaction + ", transactionAmount=" + transactionAmount + "]";
	}
	
//	private void calculateTransactionAmount() {
//		transactionAmount = productsOfTransaction.stream().mapToDouble(i -> i.getQuantity() * i.getSalePrice()).sum();
//	}
	
	
	
}

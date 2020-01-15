package com.jeffstrunk.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name = "transaction_Id")
	private Long transactionId;
//	@Column(name = "transaction_DateTime")
	private LocalDateTime transactionDateTime;
//	@Column(name = "transaction_Customer_Id")
	private String customerId;
//	@Column(name = "transaction_Amount")
	private double transactionAmount;

	
	@ManyToMany
//	(cascade = CascadeType.ALL)
	private List<Product> productsOfTransaction;
	
	public Transaction() {
	}
	
	public void addProductToList(Product product) {
		productsOfTransaction.add(product);
	}

	public double getTransactionAmount() {
// calculate Transaction Amount
//		calculateTransactionAmount();
		return transactionAmount;
	}

	public Long getId() {
		return transactionId;
	}

	public void setId(Long transactionId) {
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
	
	public Transaction(Long id, LocalDateTime transactionDateTime, String customerID, List<Product> productsOfTransaction,
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
		return "Transaction [transactionId=" + transactionId + ", transactionDateTime=" + transactionDateTime
				+ ", customerId=" + customerId + ", transactionAmount=" + transactionAmount + ", productsOfTransaction="
				+ productsOfTransaction + "]";
	}

//	@Override
//	public String toString() {
//		return "Transaction [transactionDateTime=" + transactionDateTime + ", customerID=" + customerId
//				+ ", productsOfTransaction=" + productsOfTransaction + ", transactionAmount=" + transactionAmount + "]";
//	}
}
package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends Person {
	
//	@OneToOne
//	@JoinColumn(name = "addressId")
	private ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();
	
	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String id, String phoneNum, String address) {
		super(firstName, lastName, id, phoneNum, address);
	}

	public void addToTransactionHistory(Transaction transaction) {
		transactionHistory.add(transaction);
	}
	
	public void removeFromTransactionHistory(int index) {
		transactionHistory.remove(index);
	}

//	@Override
//	public String toString() {
//		return "Customer [transactionHistory=" + transactionHistory + super.toString() + "]";
//	}

}

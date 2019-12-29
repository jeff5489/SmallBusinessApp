package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Customer extends Person {
	
	@OneToMany
	private List<Transaction> transactionHistory = new ArrayList<Transaction>();

//	public Customer(String firstName, String secondName, String id, long phoneNum, String address) {
//		super(firstName, secondName, id, phoneNum, address);
//	}
	
	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public void addToTransactionHistory(Transaction transaction) {
		transactionHistory.add(transaction);
	}
	
	public void removeFromTransactionHistory(int index) {
		transactionHistory.remove(index);
	}

	@Override
	public String toString() {
		return "Customer [transactionHistory=" + transactionHistory + super.toString() + "]";
	}

}

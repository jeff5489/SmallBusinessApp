package com.jeffstrunk.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffstrunk.dao.TransactionDao;
import com.jeffstrunk.entities.Product;
import com.jeffstrunk.entities.Transaction;

@Service
public class TransactionService {

	
	private final TransactionDao repo;

	@Autowired
	public TransactionService(TransactionDao repo) {
		this.repo = repo;
	}

	public List<Transaction> getTransactions(){
		List<Transaction> transactions = new ArrayList<Transaction>();
		repo.findAll().forEach(transactions::add);
		return transactions;
	}
	
	public Optional<Transaction> getTransaction(Long id) {
		return repo.findById(id);
	}
	
	public void addTransaction(Transaction transaction){
		repo.save(transaction);
	}
	
	public void addProductToTransaction(Product product) {
		System.out.println("addProductToTransaction() reached");
		
	}

	public void deleteTransaction(Long id) {
		repo.deleteById(id);
	}
}

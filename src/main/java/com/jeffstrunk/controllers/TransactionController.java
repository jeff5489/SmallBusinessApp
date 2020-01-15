package com.jeffstrunk.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffstrunk.dao.ProductDao;
import com.jeffstrunk.entities.Product;
import com.jeffstrunk.entities.Transaction;
import com.jeffstrunk.services.TransactionService;

@RestController
@RequestMapping("transactions")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@Autowired
	ProductDao productDao;
	
	
	@GetMapping
	public List<Transaction> getAll() {
		System.out.println("GET ALL TRANSACTIONS");
		return transactionService.getTransactions();
	}
	
	@GetMapping(path = "{id}")
	public Optional getTransaction(@NotNull @PathVariable("id")Long id) {
		System.out.println("GET ONE TRANSACTION");
		return transactionService.getTransaction(id);
	}
	
	@PostMapping
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		System.out.println("ADD TRANSACTION");
		System.out.println(transaction);
		transactionService.addTransaction(transaction);
		
		return transaction;
	}
	
//	@PostMapping
//	public void addProductToTransaction(@RequestBody Product product) {
//		System.out.println("addProductToTransaction REACHED");
//		transactionService.addProductToTransaction(product);
//	}
	
//	@PutMapping(path = "{id}")
//	public void updateTransaction(@RequestBody Transaction transaction, @PathVariable("id") int id) {
//		service.updateTransaction(transaction, id);
//
//	}
	
	@DeleteMapping(path = "{id}")
	public void deleteTransaction(@PathVariable Long id) {
		System.out.println("DELETE TRANSACTION");
		transactionService.deleteTransaction(id);
	}
}

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

import com.jeffstrunk.entities.Transaction;
import com.jeffstrunk.services.TransactionService;

@RestController
@RequestMapping("transactions")
public class TransactionController {
	private final TransactionService service;

	@Autowired
	public TransactionController(TransactionService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Transaction> getAll() {
		return service.getTransactions();
	}
	
	@GetMapping(path = "{id}")
	public Optional getTransaction(@NotNull @PathVariable("id")int id) {
		return service.getTransaction(id);
	}
	
	@PostMapping
	public void addTransaction(@RequestBody Transaction transaction) {
		service.addTransaction(transaction);
	}
	
//	@PutMapping(path = "{id}")
//	public void updateTransaction(@RequestBody Transaction transaction, @PathVariable("id") int id) {
//		service.updateTransaction(transaction, id);
//
//	}
	
	@DeleteMapping(path = "{id}")
	public void deleteTransaction(@PathVariable Integer id) {
		service.deleteTransaction(id);
	}
}

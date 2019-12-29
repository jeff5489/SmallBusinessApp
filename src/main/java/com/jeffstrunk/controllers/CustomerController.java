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

import com.jeffstrunk.entities.Customer;
import com.jeffstrunk.entities.Product;
import com.jeffstrunk.services.CustomerService;
import com.jeffstrunk.services.ProductService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	private final CustomerService service;

	@Autowired
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Customer> getAll() {
		return service.getCustomers();
	}
	
	@GetMapping(path = "{id}")
	public Optional getCustomer(@NotNull @PathVariable("id")String id) {
		return service.getCustomer(id);
	}
	
	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
	
	@PutMapping(path = "{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable("id") String id) {
		service.updateCustomer(customer, id);

	}
	
	@DeleteMapping(path = "{id}")
	public void deleteCustomer(@PathVariable String id) {
		service.deleteCustomer(id);
	}

}

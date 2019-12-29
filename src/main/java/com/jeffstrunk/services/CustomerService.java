package com.jeffstrunk.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffstrunk.dao.CustomerDao;
import com.jeffstrunk.entities.Customer;

@Service
public class CustomerService {

	private final CustomerDao repo;

	@Autowired
	public CustomerService(CustomerDao repo) {
		this.repo = repo;
	}
	
	public List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		repo.findAll().forEach(customers::add);
		return customers;
	}
	
	public Optional<Customer> getCustomer(String id) {
		return repo.findById(id);
	}
	
	public void addCustomer(Customer customer){
		repo.save(customer);
	}
	
	public void updateCustomer(Customer customer, String id) {
		repo.findById(id).map( cust -> {
			cust.setFirstName(customer.getFirstName());
			cust.setLastName(customer.getLastName());
			cust.setPhoneNum(customer.getPhoneNum());
			cust.setAddress(customer.getAddress());
			return repo.save(cust);
		});
	}

	public void deleteCustomer(String id) {
		repo.deleteById(id);
	}
}

package com.jeffstrunk.dao;

import org.springframework.data.repository.CrudRepository;

import com.jeffstrunk.entities.Customer;

public interface CustomerDao extends CrudRepository<Customer, String>  {

}

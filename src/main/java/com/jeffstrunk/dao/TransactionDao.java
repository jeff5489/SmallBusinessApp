package com.jeffstrunk.dao;

import org.springframework.data.repository.CrudRepository;

import com.jeffstrunk.entities.Product;
import com.jeffstrunk.entities.Transaction;

public interface TransactionDao extends CrudRepository<Transaction, Integer> {

}

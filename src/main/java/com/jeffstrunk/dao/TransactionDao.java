package com.jeffstrunk.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffstrunk.entities.Product;
import com.jeffstrunk.entities.Transaction;

@Repository
@Transactional
public interface TransactionDao extends CrudRepository<Transaction, Long> {

}

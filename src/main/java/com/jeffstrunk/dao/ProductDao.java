package com.jeffstrunk.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffstrunk.entities.Product;

@Repository
@Transactional
public interface ProductDao extends CrudRepository<Product, Long> {

}

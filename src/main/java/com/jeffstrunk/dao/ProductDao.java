package com.jeffstrunk.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffstrunk.entities.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}

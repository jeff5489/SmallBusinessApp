package com.jeffstrunk.dao;

import org.springframework.data.repository.CrudRepository;

import com.jeffstrunk.entities.Product;
import com.jeffstrunk.entities.SaleItem;

public interface SaleItemDao extends CrudRepository<SaleItem, Integer>  {

}

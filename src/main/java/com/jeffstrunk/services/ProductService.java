package com.jeffstrunk.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffstrunk.dao.ProductDao;
import com.jeffstrunk.entities.Product;

@Service
public class ProductService {
	
	private final ProductDao repo;

	@Autowired
	public ProductService(ProductDao repo) {
		this.repo = repo;
	}

	public List<Product> getProducts(){
		List<Product> products = new ArrayList<Product>();
		repo.findAll().forEach(products::add);
		return products;
	}
	
	public Optional<Product> getProduct(long id) {
		return repo.findById(id);
	}
	
	public void addProduct(Product product){
		repo.save(product);
	}
	
	public void updateProduct(Product product, long id) {
		repo.findById(id).map( item -> {
			item.setId(product.getId());
			item.setName(product.getName());
			item.setSalePrice(product.getSalePrice());
			return repo.save(item);
		});
	}

	public void deleteProduct(long id) {
		repo.deleteById(id);
	}
}


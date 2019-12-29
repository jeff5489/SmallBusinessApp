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

import com.jeffstrunk.entities.Product;
import com.jeffstrunk.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	private final ProductService service;

	@Autowired
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Product> getAll() {
		return service.getProducts();
	}
	
	@GetMapping(path = "{id}")
	public Optional getProduct(@NotNull @PathVariable("id")int id) {
		return service.getProduct(id);
	}
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}
	
	@PutMapping(path = "{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable("id") int id) {
		service.updateProduct(product, id);

	}
	
	@DeleteMapping(path = "{id}")
	public void deleteProduct(@PathVariable Integer id) {
		service.deleteProduct(id);
	}
	
}

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
@RequestMapping("products")
public class ProductController {

	private final ProductService service;

	@Autowired
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@GetMapping
	
	public List<Product> getAll() {
		System.out.println("getAll Products reached");
		return service.getProducts();
	}
	
	@GetMapping(path = "{id}")
	public Optional getProduct(@NotNull @PathVariable("id")long id) {
		System.out.println("get one Products reached");
		return service.getProduct(id);
	}
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		System.out.println("add one Product reached");
		service.addProduct(product);
	}
	
	@PutMapping(path = "{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable("id") long id) {
		System.out.println("updateProduct reached");
		service.updateProduct(product, id);

	}
	
	@DeleteMapping(path = "{id}")
	public void deleteProduct(@PathVariable long id) {
		System.out.println("deleteProduct reached");
		service.deleteProduct(id);
	}
	
}

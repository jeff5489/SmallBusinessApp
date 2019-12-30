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

import com.jeffstrunk.entities.SaleItem;
import com.jeffstrunk.services.SaleItemService;

@RestController
@RequestMapping("saleitems")
public class SaleItemController {
	
	private final SaleItemService service;

	@Autowired
	public SaleItemController(SaleItemService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<SaleItem> getAll() {
		return service.getSaleItems();
	}
	
	@GetMapping(path = "{id}")
	public Optional getSaleItem(@NotNull @PathVariable("id")int id) {
		return service.getSaleItem(id);
	}
	
	@PostMapping
	public void addSaleItem(@RequestBody SaleItem saleItem) {
		service.addSaleItem(saleItem);
	}
	
	@PutMapping(path = "{id}")
	public void updateSaleItem(@RequestBody SaleItem saleItem, @PathVariable("id") int id) {
		service.updateSaleItem(saleItem, id);

	}
	
	@DeleteMapping(path = "{id}")
	public void deleteSaleItem(@PathVariable Integer id) {
		service.deleteSaleItem(id);
	}
	
}

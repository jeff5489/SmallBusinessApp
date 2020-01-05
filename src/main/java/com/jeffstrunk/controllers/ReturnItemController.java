//package com.jeffstrunk.controllers;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.constraints.NotNull;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jeffstrunk.entities.ReturnItem;
//import com.jeffstrunk.services.ReturnItemService;
//
//@RestController
//@RequestMapping("returnitems")
//public class ReturnItemController {
//	private final ReturnItemService service;
//
//	@Autowired
//	public ReturnItemController(ReturnItemService service) {
//		this.service = service;
//	}
//	
//	@GetMapping
//	public List<ReturnItem> getAll() {
//		return service.getReturnItems();
//	}
//	
//	@GetMapping(path = "{id}")
//	public Optional getReturnItem(@NotNull @PathVariable("id")int id) {
//		return service.getReturnItem(id);
//	}
//	
//	@PostMapping
//	public void addReturnItem(@RequestBody ReturnItem returnItem) {
//		service.addReturnItem(returnItem);
//	}
//	
//	@PutMapping(path = "{id}")
//	public void updateReturnItem(@RequestBody ReturnItem returnItem, @PathVariable("id") int id) {
//		service.updateReturnItem(returnItem, id);
//
//	}
//	
//	@DeleteMapping(path = "{id}")
//	public void deleteReturnItem(@PathVariable Integer id) {
//		service.deleteReturnItem(id);
//	}
//}

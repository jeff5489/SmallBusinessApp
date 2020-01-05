//package com.jeffstrunk.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jeffstrunk.dao.ReturnItemDao;
//import com.jeffstrunk.dao.SaleItemDao;
//import com.jeffstrunk.entities.ReturnItem;
//import com.jeffstrunk.entities.SaleItem;
//
//@Service
//public class ReturnItemService {
//
//	private final ReturnItemDao repo;
//
//	@Autowired
//	public ReturnItemService(ReturnItemDao repo) {
//		this.repo = repo;
//	}
//
//	public List<ReturnItem> getReturnItems(){
//		List<ReturnItem> returnItems = new ArrayList<ReturnItem>();
//		repo.findAll().forEach(returnItems::add);
//		return returnItems;
//	}
//	
//	public Optional<ReturnItem> getReturnItem(int id) {
//		return repo.findById(id);
//	}
//	
//	public void addReturnItem(ReturnItem returnItem){
//		repo.save(returnItem);
//	}
//	
//	public void updateReturnItem(ReturnItem returnItem, int id) {
//		repo.findById(id).map( item -> {
//			item.setId(returnItem.getId());
//			item.setQuantity(returnItem.getQuantity());
//			item.setName(returnItem.getName());
//			item.setSalePrice(returnItem.getSalePrice());
//			return repo.save(item);
//		});
//	}
//
//	public void deleteReturnItem(int id) {
//		repo.deleteById(id);
//	}
//}

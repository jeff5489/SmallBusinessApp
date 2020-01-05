//package com.jeffstrunk.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jeffstrunk.dao.SaleItemDao;
//import com.jeffstrunk.entities.Product;
//import com.jeffstrunk.entities.SaleItem;
//
//@Service
//public class SaleItemService {
//	private final SaleItemDao repo;
//
//	@Autowired
//	public SaleItemService(SaleItemDao repo) {
//		this.repo = repo;
//	}
//
//	public List<SaleItem> getSaleItems(){
//		List<SaleItem> saleItems = new ArrayList<SaleItem>();
//		repo.findAll().forEach(saleItems::add);
//		return saleItems;
//	}
//	
//	public Optional<SaleItem> getSaleItem(int id) {
//		return repo.findById(id);
//	}
//	
//	public void addSaleItem(SaleItem saleItem){
//		repo.save(saleItem);
//	}
//	
//	public void updateSaleItem(SaleItem saleItem, int id) {
//		repo.findById(id).map( item -> {
//			item.setId(saleItem.getId());
//			item.setQuantity(saleItem.getQuantity());
//			item.setName(saleItem.getName());
//			item.setSalePrice(saleItem.getSalePrice());
//			return repo.save(item);
//		});
//	}
//
//	public void deleteSaleItem(int id) {
//		repo.deleteById(id);
//	}
//}

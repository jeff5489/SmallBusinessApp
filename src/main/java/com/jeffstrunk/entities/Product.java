package com.jeffstrunk.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_Id")
	private long productId;
	
	@Column(name = "product_Name")
	private String productName;

	@Column(name = "product_Saleprice")
	private double productSalePrice;
	
	@ManyToMany(mappedBy = "productsOfTransaction")
	private List <Transaction> transactions;
	
//	@Column(name = "transaction_Id")
//	private long transactionId;
	
//	@ManyToOne
//	@JoinColumn(name = "transactionId")
//	private long transactionId;
	
//	@ManyToOne
//	private Transaction transaction;
	
	public double getSalePrice() {
		return productSalePrice;
	}
	public void setSalePrice(double salePrice) {
		this.productSalePrice = salePrice;
	}
	public Product() {
		
	}
	public Product(long productId, String productName, double salePrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productSalePrice = salePrice;
	}
	public Product(String name, double salePrice) {
		super();
		this.productName = name;
		this.productSalePrice = salePrice;
	}
	public long getId() {
		return productId;
	}
	public void setId(long id) {
		this.productId = id;
	}
	public String getName() {
		return productName;
	}
	public void setName(String name) {
		this.productName = name;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productSalePrice="
				+ productSalePrice + ", transactions=" + transactions + "]";
	}
//	@Override
//	public String toString() {
//		return "Product [id=" + productId + ", name=" + productName + ", salePrice=" + productSalePrice + "]";
//	}
	
//	public long getTransactionId() {
//		return transactionId;
//	}
//	public void setTransaction_Id(long transactionId) {
//		this.transactionId = transactionId;
//	}
}

package com.jeffstrunk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")

public class Product {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "saleprice")
	private double salePrice;
	
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public Product() {
		
	}
	public Product(String id, String name, double salePrice) {
		super();
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
	}
	public Product(String name, double salePrice) {
		super();
		this.name = name;
		this.salePrice = salePrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", salePrice=" + salePrice + "]";
	}
}

package com.jeffstrunk.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int id;
	private String name;
	private double salePrice;
	
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public Product() {
		
	}
	public Product(int id, String name, double salePrice) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

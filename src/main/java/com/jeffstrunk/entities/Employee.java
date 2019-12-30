package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public abstract class Employee extends Person {
	
	private double payRate;
	private Date hireDate;
	private String title;

	public Employee() {
		super();
	}

	public Employee(String firstName, String secondName, String id, long phoneNum, String address) {
		super(firstName, secondName, id, phoneNum, address);
	}

	public Employee(String firstName, String secondName, String id, long phoneNum, String address, double payRate,
			Date hireDate, String title) {
		super(firstName, secondName, id, phoneNum, address);
		this.payRate = payRate;
		this.hireDate = hireDate;
		this.title = title;
	}

//	public void createSale(Date hireDate, String id, ArrayList list) {
//		Sale sale = new Sale(hireDate, id, list);
//	}
//	
//	public void createReturn(Date hireDate, String id, ArrayList list) {
//		ReturnItem returnItem = new ReturnItem(hireDate, id, list);
//		
//	}
	
	public void generateCustomerTransactionHistory() {
		
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}

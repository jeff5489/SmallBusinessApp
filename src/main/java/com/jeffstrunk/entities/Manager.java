package com.jeffstrunk.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {

	public Manager(String firstName, String lastName, String id, long phoneNum, String address, double payRate,
			Date hireDate, String title) {
		super(firstName, lastName, id, phoneNum, address, payRate, hireDate, title);
	}

	public Manager() {
	}

	public void generateInventoryReport() {
		InventoryListContainer.InventoryList.getInventoryList();
	}

	public void enterNewProduct(InventoryItem item) {
		InventoryListContainer.InventoryList.addToInventoryList(item);
	}
	
	public void removeProduct(int index) {
		InventoryListContainer.InventoryList.removeFromInventoryList(index);
	}
	
	public void createClerk(String firstName, String lastName, String id, long phoneNum, String address, double payRate, 
			Date hireDate, String title) {
		Clerk clerk = new Clerk(firstName, lastName, id, phoneNum, address, payRate, hireDate, title);
		EmployeeListContainer.EmployeeList.addToEmployeeList(clerk);
	}
	
	public void createManager(String firstName, String lastName, String id, long phoneNum, String address, double payRate, 
			Date hireDate, String title) {
		Manager manager = new Manager(firstName, lastName, id, phoneNum, address, payRate, hireDate, title);
		EmployeeListContainer.EmployeeList.addToEmployeeList(manager);
	}
}
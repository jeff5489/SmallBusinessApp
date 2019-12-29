package com.jeffstrunk.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Clerk extends Employee {

	public Clerk() {
		
	}
	
	public Clerk(String firstName, String secondName, String id, long phoneNum, String address, double payRate,
			Date hireDate, String title) {
		super(firstName, secondName, id, phoneNum, address, payRate, hireDate, title);
	}
}
package com.jeffstrunk.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Person {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private long phoneNum;
	private String address;
	
	public Person() {
	}

	public Person(String firstName, String lastName, String id, long phoneNum, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secondName=" + lastName + ", id=" + id + ", phoneNum=" + phoneNum
				+ ", address=" + address + "]";
	}
	
	
}
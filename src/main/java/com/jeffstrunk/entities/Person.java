package com.jeffstrunk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "persons")

public abstract class Person {

	@Id
	private String id;
	
//	@Column(name = "first_name")
	private String firstName;
	
//	@Column(name = "last_name")
	private String lastName;
	
//	@Column(name = "phone_num")
	private String phoneNum;
	
//	@Column(name = "address")
	private String address;
	
	public Person() {
	}

	public Person(String firstName, String lastName, String id, String phoneNum, String address) {
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
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
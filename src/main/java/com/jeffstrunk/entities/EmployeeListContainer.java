package com.jeffstrunk.entities;

import java.util.ArrayList;

import javax.persistence.Entity;

//@Entity
public class EmployeeListContainer {
	
	public static class EmployeeList{
		
		private static ArrayList<Employee> list = new ArrayList<Employee>();
		
		public static final EmployeeList employeeList = new EmployeeList();
		
		private EmployeeList() {
		}
		
		public static ArrayList<Employee> getEmployeeList() {
			return list;
		}
		
		public static void addToEmployeeList(Employee emp) {
			list.add(emp);
		}
		
		public static void removeFromEmployeeList(int index) {
			list.remove(index);
		}
		
	}	
}
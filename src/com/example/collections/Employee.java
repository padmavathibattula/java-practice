package com.example.collections;

import java.util.HashMap;

/*
 * Assignment 1:Create an Employee class with instance variables-employeeid(String)and name(String)two employee 
 * objects are equal if they have same employeeid and name.put the employee objects as keys in hashmap and print them using for loop
 */

public class Employee {
	private String empId;
	private String name;

	public Employee(String empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee employee = (Employee) obj;
		if (this.empId.equals(employee.empId) && this.name.equals(employee.name)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int result = this.name.hashCode();
		result = result + this.empId.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		HashMap<Employee,Integer>employeeMap=new HashMap<>();
		Employee padma = new Employee("padma","101");
		employeeMap.put(padma, 1);
		Employee sujatha=new Employee("padma","101");
		employeeMap.put(sujatha, 2);
		for(Employee key:employeeMap.keySet()) {
			System.out.print(key);
			System.out.println(employeeMap.get(key));
		}
	}
	

}

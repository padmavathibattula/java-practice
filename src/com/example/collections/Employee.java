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
		Employee emp = (Employee) obj;
		if (this.empId.equals(emp.empId) && this.name.equals(emp.name)) {
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
		HashMap<Employee,Integer>employeeDetails=new HashMap<>();
		Employee emp1= new Employee("padma","101");
		employeeDetails.put(emp1, 1);
		Employee emp2=new Employee("niha","101");
		employeeDetails.put(emp2, 2);
		for(Employee key:employeeDetails.keySet()) {
			System.out.print(key);
			System.out.println(employeeDetails.get(key));
		}
		
	}
	

}

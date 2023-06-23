package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Assignment 1:Create an Employee class with instance variables-employeeid(String)and name(String)two employee 
 * objects are equal if they have same employeeid and name.put the employee objects as keys in hashmap and print them using for loop
 */
/*
 * in the employee class add an instance variable salary(float) and implement comparable interface to compare salaries create a arraylist of employees and sort them using collections.sort() method
 */

public class Employee implements Comparable<Employee> {
	private String empId;
	private String name;
	private float salary;

	public Employee(String empId, String name,float salary) {
		this.empId = empId;
		this.name = name;
		this.salary=salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee emp = (Employee) obj;
		if (this.empId.equals(emp.empId) && this.name.equals(emp.name)&&this.salary==(emp.salary)) {
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
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		HashMap<Employee,Integer>employeeDetails=new HashMap<>();
		Employee emp1= new Employee("padma","101",2523);
		employeeDetails.put(emp1, 1);
		Employee emp2=new Employee("niha","101",2564);
		employeeDetails.put(emp2, 2);
		for(Employee key:employeeDetails.keySet()) {
			System.out.print(key);
			System.out.println(employeeDetails.get(key));
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of employee salaries:");
			int size=sc.nextInt();
			ArrayList<Float>employee=new ArrayList<>();
			System.out.println("Enter employee salaries:");
			float salary=sc.nextFloat();
			for(int i=0;i<size;i++) {
				employee.add(sc.nextFloat());
			}
			System.out.println("Before collections sort employee salaries:"+employee);
			Collections.sort(employee);
			System.out.println("After colletion sort employee salaries:"+employee);
		}
		
		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

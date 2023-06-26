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

	public Employee(String empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Employee emp = (Employee) obj;
		if (this.empId.equals(emp.empId) && this.name.equals(emp.name) && this.salary == (emp.salary)) {
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

	public int compareTo(Employee obj) {
		if (this.salary < obj.salary) {
			return -1;
		} else if (this.salary > obj.salary) {
			return 1;

		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of employee salaries: ");
		int size = scanner.nextInt();
		ArrayList<Float> employee = new ArrayList<>();
		System.out.println("Enter employee salaries: ");
		float salary = scanner.nextFloat();
		for (int i = 0; i < size; i++) {
			employee.add(scanner.nextFloat());
			ArrayList<Employee> employees = new ArrayList<>();
			Employee emp1 = new Employee("12345", "sujatha", (float) 10.5);
			Employee emp2 = new Employee("123456", "Shiva", (float) 5.5);
			int compare = emp1.compareTo(emp2);
			if (compare == 1) {
				System.out.println(emp1.name + " salary is greater than " + emp2.name + " salary");
			} else if (compare == -1) {
				System.out.println(emp1.name + " salary is less than " + emp2.name + " salary");
			} else {
				System.out.println(emp1.name + " and  " + emp2.name + " have the same salary");
			}
			System.out.println("Before collection sort employee salaries: " + employees);
			employees.add(emp1);
			employees.add(emp2);
			System.out.println("Before collection sort employee salaries: " + employees);
			Collections.sort(employees);
			System.out.println("After collection sort employee salaries: " + employees);
			System.out.println("After collection sort employee salaries: " + employees);
		}
	}
}

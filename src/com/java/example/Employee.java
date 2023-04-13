package com.java.example;

public class Employee {
	String name = "Prasanna";
	int salary = 20000;
	String country = "India";
	String company = "Tech.M";

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Ms " + emp.name + " is working in " + emp.company + " for " + emp.salary
				+ " per month whic is located in " + emp.country);
	}

}

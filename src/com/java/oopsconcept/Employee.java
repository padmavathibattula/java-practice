package com.java.oopsconcept;

public class Employee {
	float salary = 2000;
}

class Programmer extends Employee {
	float bounus = 10000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("The Employee salary is : " + p.salary);
		System.out.println("The Employee Bonus is : " + p.bounus);
	}
}

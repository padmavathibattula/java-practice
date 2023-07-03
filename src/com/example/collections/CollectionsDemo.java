package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("padma");
		names.add("sujatha");
		names.add("nihaswi");
		names.add("siva");
		names.add("latha");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		ArrayList<Person> persons = new ArrayList<>();
		Person person1 = new Person("padma", 35, 34.2);
		Person person2 = new Person("Sujatha", 21, 78.6);
		Person person3 = new Person("Siva", 29, 65.3);
		Person person4 = new Person("latha", 30, 34.56);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		System.out.println(persons);
		Collections.sort(persons);
		System.out.println(persons);
		ArrayList<StudentDetails> students = new ArrayList<>();
		StudentDetails student1 = new StudentDetails("A201", "padma", 123);
		StudentDetails student2 = new StudentDetails("A99", "niha", 34);
		StudentDetails student3 = new StudentDetails("B101", "latha", 78);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		System.out.println(students);// without sort
		Collections.sort(students);// internal sort by gpa
		System.out.println(students);
		Collections.sort(students, new StudentIdComparator());// external sort by studentid
		System.out.println(students);
		Collections.sort(students, new StudentNameComparator());// external sort by studentName
		System.out.println(students);
		ArrayList<Employee>employees=new ArrayList<>();
		Employee emp1=new Employee("T101","niha",678);
		Employee emp2=new Employee("P102","padma",89);
		Employee emp3=new Employee("C104","rajani",78);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		System.out.println(employees);// without sort
		Collections.sort(employees);// internal sort by salary
		System.out.println(employees);
		Collections.sort(employees,new EmployeeIdComparator());// external sort by employeeid
		System.out.println(employees);
		Collections.sort(employees, new EmployeeNameComparator());// external sort by employeename
		System.out.println(employees);

	}

}

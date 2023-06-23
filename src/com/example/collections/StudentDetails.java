package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Assignment 2:create a student class with instance variables-student id(String)and name(String) two student
 *  objects are equal if they have same studentid and name put the student object as keys in hashmap and print 
 *  them using for each loop
 */
/*
 * in the student class add an instance variable gpa(double) and implement comparable gpa,s create a arraylist of student 
 * of students and sort them using collections.sort()method
 */

public class StudentDetails {
	private String studentId;
	private String studentName;
	private double gpa;

	public StudentDetails(String studentId, String studentName, double gpa) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.gpa = gpa;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		StudentDetails sudent = (StudentDetails) obj;
		if (this.equals(sudent.studentId) && this.studentName.equals(sudent.studentName) && this.gpa == (sudent.gpa)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int result = this.studentName.hashCode();
		result = result + this.studentId.hashCode();
		return result;
	}
	public int compareTo(StudentDetails obj) {
		if (this.gpa < obj.gpa) {
			return -1;
		} else if (this.gpa > obj.gpa) {
			return 1;

		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	public static void main(String[] args) {
		/*HashMap<StudentDetails, Integer> student = new HashMap<>();
		StudentDetails padma = new StudentDetails("niha", "200", 123.5);
		student.put(padma, 1);
		StudentDetails padma1 = new StudentDetails("padma", "200", 456.7);
		student.put(padma1, 2);
		for (StudentDetails key : student.keySet()) {
			System.out.print(key + " ");
			System.out.println(student.get(key));
		}*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of students gpa:");
		int size=sc.nextInt();
		ArrayList<Double>student=new ArrayList<>();
		System.out.println("Enter students gpa:");
		double gpa=sc.nextDouble();
		for(int i=0;i<size;i++) {
			student.add(sc.nextDouble());
			ArrayList<StudentDetails>students=new ArrayList<>();
			StudentDetails student1=new StudentDetails("niha","123",(double)34.67);
			StudentDetails student2=new StudentDetails("padma","4567",(double)456.7);
			 int compare = student1.compareTo(student2);
			if (compare == 1) {
				System.out.println(student1.studentName + " gpa is greater than " + student2.studentName + " gpa");
			} else if (compare == -1) {
				System.out.println(student1.studentName + " gpa is less than " + student2.studentName + " gpa");
			} else {
				System.out.println(student1.studentName + " and  " + student2.studentName + " have the same gpa");
			}
			System.out.println("Before collection sort employee salaries: " + students);
			students.add(student1);
			students.add(student2);
			System.out.println("Before collection sort employee salaries: " + students);
			Collections.sort(student);
			System.out.println("After collection sort employee salaries: " + students);
			System.out.println("After collection sort employee salaries: " + students);
			
		}
		

	}

}

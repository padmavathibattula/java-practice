package com.example.collections;

import java.util.HashMap;

/*
 * Assignment 2:create a student class with instance variables-student id(String)and name(String) two student
 *  objects are equal if they have same studentid and name put the student object as keys in hashmap and print 
 *  them using for each loop
 */

public class Student1 {
	private String studentId;
	private String studentName;
	public Student1(String studentId,String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}
	@Override
		public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		Student1 sudent=(Student1)obj;
		if(this.equals(sudent.studentId)&&this.studentName.equals(sudent.studentName)) {
			return true;
		}else {
			return false;
		}
		}
	@Override
		public int hashCode() {
		int result=this.studentName.hashCode();
		result=result+this.studentId.hashCode();
		return result;
		}
	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	public static void main(String[] args) {
		HashMap<Student1,Integer>student=new HashMap<>();
		Student1 padma=new Student1("niha","200");
		student.put(padma, 1);
		Student1 padma1=new Student1("padma","200");
		student.put(padma1, 2);
		for(Student1 key:student.keySet()) {
			System.out.print(key + " ");
			System.out.println(student.get(key));
		}
	}

}

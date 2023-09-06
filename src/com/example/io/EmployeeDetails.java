package com.example.io;

import java.util.Objects;

public class EmployeeDetails {
		private int employeeid;
		private String firstName;
		private String lastName;
		private String department;
		private int salary;
		public int getId() {
			return employeeid;
		}
		public void setId(int id) {
			this.employeeid = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "EmployeeDetails [employeeid=" + employeeid + ", firstName=" + firstName + ", lastName=" + lastName + ",  department=" + department + ", salary=" + salary + ", getId()=" + getId()
					+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ",  getDepartment()=" + getDepartment() + ", getSalary()=" + getSalary()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		// equls and hashcode 
		@Override
		public int hashCode() {
			return Objects.hash(department, firstName, employeeid, lastName,  salary);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EmployeeDetails other = (EmployeeDetails) obj;
			return Objects.equals(department, other.department) && Objects.equals(firstName, other.firstName)
					&& employeeid == other.employeeid && Objects.equals(lastName, other.lastName)
					 && salary == other.salary;
		}
		// step 1: convert xml to  java object ->marashling
		// step2: override equals and hashcode in employee class using  attributes 
		// step3 : convert java list to set-> remove duplicates
		//step4: insert into data in db
		// database schema:conversion
		// table name: employee




		}





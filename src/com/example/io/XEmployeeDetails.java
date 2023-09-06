package com.example.io;
import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="employee")
public class XEmployeeDetails {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private int salary;
	
	public XEmployeeDetails(int employeeId, String firstName, String lastName, String department, int salary) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary = salary;
	}
	public XEmployeeDetails() {
		
	}
	@XmlElement(name="EmployeeID")
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@XmlElement(name="FirstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement(name="LastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@XmlElement(name="Department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@XmlElement(name="Salary")

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "XEmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", salary=" + salary + "]";
	}
	
	public Object getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    XEmployeeDetails that = (XEmployeeDetails) o;
	    return employeeId == that.employeeId;
	}

	@Override
	public int hashCode() {
	    return Objects.hash(employeeId);
	}

	
	
	

}

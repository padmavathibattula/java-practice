package com.example.io;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="employee")
public class XEmployeeDetails {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String position;
	private String department;
	private int salary;
	
	public XEmployeeDetails(int id, String firstName, String lastName, String position, String department, int salary,String email) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.department = department;
		this.salary = salary;
		this.email=email;
	}
	public XEmployeeDetails() {
		
	}
	@XmlElement(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlElement(name="firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement(name="lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlElement(name="position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	@XmlElement(name="department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@XmlElement(name="salary")

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "XEmployeeDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", position=" + position + ", department=" + department + ", salary=" + salary + "]";
	}
	public void getEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public Object getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

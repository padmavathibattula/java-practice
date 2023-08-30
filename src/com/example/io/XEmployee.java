package com.example.io;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "employees")
public class XEmployee {
	 private List<XEmployeeDetails> employees;

	    public void Employee() {
	        employees = new ArrayList<>();
	    }
	    @XmlElement(name = "employee")
	    public List<XEmployeeDetails> getEmployee() {
	        return employees;
	    }

	    public void setEmployee(List<XEmployeeDetails> employee) {
	        this.employees = employee;
	    }
	    public void addEmployee(XEmployeeDetails employee) {
			employees.add(employee);
		}
		public List<XEmployeeDetails> getEmployees() {
			return employees;
		}
		public void setEmployees(List<XEmployeeDetails> employees) {
			this.employees = employees;
		}
		public int getId() {
			// TODO Auto-generated method stub
			return 0;
		}
		public String getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getLastName() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getPosition() {
			// TODO Auto-generated method stub
			return null;
		}
		public double getSalary() {
			// TODO Auto-generated method stub
			return 0;
		}
		public String getDepartment() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}
	    
}

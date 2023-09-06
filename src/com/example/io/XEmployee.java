package com.example.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
		public int getEmployeeId() {
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
		
		public double getSalary() {
			// TODO Auto-generated method stub
			return 0;
		}
		public String getDepartment() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean equals(Object o) {
		    if (this == o) return true;
		    if (o == null || getClass() != o.getClass()) return false;
		    XEmployee employee = (XEmployee) o;
		    return employees == employee.employees &&
		            Double.compare(employee.getSalary(), getSalary()) == 0 &&
		            Objects.equals(getFirstName(), employee.getFirstName()) &&
		            Objects.equals(getLastName(), employee.getLastName()) &&
		            Objects.equals(getDepartment(), employee.getDepartment());
		}

		@Override
		public int hashCode() {
		    return Objects.hash(employees, getFirstName(), getLastName(), getDepartment(), getSalary());
		}

		
	    
}

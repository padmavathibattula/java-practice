package com.example.io;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "employees")
public class Organization {
	
    private List<XEmployeeDetails> employees;

    public Organization() {
        employees = new ArrayList<>();
    }
    @XmlElement(name = "employee")
    public List<XEmployeeDetails> getEmployee() {
        return employees;
    }

    public void setEmployee(List<XEmployeeDetails> employee) {
        this.employees = employee;
    }
}

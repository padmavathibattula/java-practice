package com.example.io;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XEmployeeMarshal {
	  public static void main(String[] args) {
	        try {
	            // Step 1: Read the existing XML and unmarshal it into Java objects
	            JAXBContext context = JAXBContext.newInstance(XEmployee.class);
	            Unmarshaller unmarshaller = context.createUnmarshaller();

	            File xmlFile = new File("C:\\Users\\battula.padmavathi\\Documents\\employees.xml");
	            XEmployee employee = (XEmployee) unmarshaller.unmarshal(xmlFile);
				

	            XEmployeeDetails newEmp = new XEmployeeDetails();
				newEmp.setId(11);
				newEmp.setFirstName("sujatha");
				newEmp.setLastName("kogapu");
				newEmp.setPosition("student");
				newEmp.setDepartment("coding");
				newEmp.setSalary(10000);
				newEmp.getEmail("battula.padmavathi@gmail.com");

				if (employee.getEmployee() != null) {
	                employee.getEmployee().add(newEmp); // Use add() method on the list
	            } else {
	                System.err.println("Error: Employee list is null.");
	            }

	            // Step 3: Marshal the updated library back to XML
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            try {
					marshaller.marshal(employee, new FileWriter("C:\\Users\\battula.padmavathi\\Documents\\employeesoutput.xml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	           
	            System.out.println("New book added successfully.");
	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	    }
	

}

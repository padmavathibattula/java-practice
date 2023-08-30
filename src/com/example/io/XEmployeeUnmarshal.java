package com.example.io;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XEmployeeUnmarshal{
	public static void main(String[] args) {
        try {
            // Step 1: Create an instance of JAXB context and unmarshaller
            JAXBContext context = JAXBContext.newInstance(XEmployee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Step 2: Unmarshal the XML file into Java objects
            File xmlFile = new File("C:\\Users\\battula.padmavathi\\Documents\\employees.xml");
            XEmployee employee = (XEmployee) unmarshaller.unmarshal(xmlFile);

            // Step 3: Print the details to the console
            for (XEmployeeDetails emp : employee.getEmployee()) {
            	 System.out.println("ID: " + emp.getId());
                 System.out.println("First Name: " + emp.getFirstName());
                 System.out.println("Last Name: " + emp.getLastName());
                 System.out.println("Position: " + emp.getPosition());
                 System.out.println("Department: " + emp.getDepartment());
                 System.out.println("Salary: " + emp.getSalary());
                 System.out.println("Email: " + emp.getEmail());
                 System.out.println();
             	System.out.println(emp);
             }
             System.out.println("successfully get the employee details");

               
            
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }



}

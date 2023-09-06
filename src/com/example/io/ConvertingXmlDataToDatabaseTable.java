package com.example.io;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ConvertingXmlDataToDatabaseTable {
    public static void main(String[] args) throws ClassNotFoundException, JAXBException {
        String dbName = "conversion"; // Update with your database name
        String userName = "root";
        String passWord = "root";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        // Step 1: Create JAXB context and unmarshaller
        JAXBContext context = JAXBContext.newInstance(XEmployee.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // Step 2: Unmarshal the XML file into Java objects
        File xmlFile = new File("C:\\Users\\DELL\\Downloads\\employees.xml");
        XEmployee employee = (XEmployee) unmarshaller.unmarshal(xmlFile);
        List<XEmployeeDetails> employeeList = employee.getEmployee();

        Set<Integer> uniqueEmployeeIds = new HashSet<>();

        // Step 4: Create a list to store unique employee details
        List<XEmployeeDetails> uniqueEmployees = new ArrayList<>();

        for (XEmployeeDetails empDetails : employeeList) {
            if (uniqueEmployeeIds.add(empDetails.getEmployeeId())) {
                uniqueEmployees.add(empDetails);
            }
        }

        System.out.println("Number of unique employees: " + uniqueEmployees.size());

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, userName, passWord);) {
            connection.setAutoCommit(true);

            String insertSql = "INSERT INTO employee (EmployeeID, FirstName, LastName, Department, Salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

            for (XEmployeeDetails empDetails : uniqueEmployees) {
                //System.out.println(empDetails.getEmployeeId()); // Print EmployeeID to console
                preparedStatement.setInt(1, empDetails.getEmployeeId());
                preparedStatement.setString(2, empDetails.getFirstName());
                preparedStatement.setString(3, empDetails.getLastName());
                preparedStatement.setString(4, empDetails.getDepartment());
                preparedStatement.setDouble(5, empDetails.getSalary());

                preparedStatement.executeUpdate();
            }

            preparedStatement.close();

            if (!employee.getEmployee().isEmpty()) {
                System.out.println("Employees inserted successfully.");
            } else {
                System.out.println("List is empty");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

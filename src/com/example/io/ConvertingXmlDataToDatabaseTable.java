package com.example.io;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class ConvertingXmlDataToDatabaseTable {
	public static void main(String[] args) throws ClassNotFoundException, JAXBException, IOException {
		String dbName = "organization"; // Update with your database name
		String userName = "postgres";
		String passWord = "postgres";
		String url = "jdbc:postgresql://localhost:5432/" + dbName;

		JAXBContext context = JAXBContext.newInstance(XEmployee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		// Step 2: Unmarshal the XML file into Java objects
		File xmlFile = new File("C:\\Users\\battula.padmavathi\\Documents\\employees.xml");
		XEmployee employee = (XEmployee) unmarshaller.unmarshal(xmlFile);
		
		
		 

		Class.forName("org.postgresql.Driver");
		try (Connection connection = DriverManager.getConnection(url, userName, passWord);) {

			connection.setAutoCommit(true);

			String insertSql = "INSERT INTO employees (id, firstName, lastName, position, department, salary) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

			for (XEmployeeDetails empDetails : employee.getEmployee()) {
				System.out.println(empDetails);
				preparedStatement.setInt(1, empDetails.getId());
				preparedStatement.setString(2, empDetails.getFirstName());
				preparedStatement.setString(3, empDetails.getLastName());
				preparedStatement.setString(4, empDetails.getPosition());
				preparedStatement.setString(5, empDetails.getDepartment());
				preparedStatement.setDouble(6, empDetails.getSalary());
				//preparedStatement.setString(7, empDetails.getEmail());

				preparedStatement.executeUpdate();
			}

			preparedStatement.close();
			// connection.commit(); // Commit the transaction
			if (!employee.getEmployee().isEmpty()) {
				System.out.println("Employees inserted successfully.");
			} else {
				System.out.println("list is empty");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

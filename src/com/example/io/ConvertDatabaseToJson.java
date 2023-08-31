package com.example.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertDatabaseToJson {

	public static void convertObjToJson(Organization org) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String outPut = "C:\\Users\\battula.padmavathi\\Documents\\Organization.json";
		// Serialize the updated library to JSON
		String newJson = gson.toJson(org);

		try (FileWriter writer = new FileWriter(outPut)) {
			writer.write(newJson);
			System.out.println("Employee added to JSON file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void readDataFromDB(Connection connection, Organization org) {
		String query = " SELECT * FROM employees";

		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			// Step 2: Retrieve employee data from the database

			List<EmployeeDetails> list = new ArrayList<>();
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					EmployeeDetails employee = new EmployeeDetails();
					employee.setId(resultSet.getInt("id"));
					employee.setFirstName(resultSet.getString("firstName"));
					employee.setLastName(resultSet.getString("lastName"));
					employee.setPosition(resultSet.getString("position"));
					employee.setDepartment(resultSet.getString("department"));
					employee.setSalary(resultSet.getInt("salary"));
					// Set other employee properties
					list.add(employee);
				}
			}
			org.setEmployee(list);

			// connection.commit(); // Commit the transaction

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		String dbName = "organization"; // Update with your database name
		String userName = "postgres";
		String passWord = "postgres";
		String url = "jdbc:postgresql://localhost:5432/" + dbName;

		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(url, userName, passWord);

		connection.setAutoCommit(true);
		return connection;
	}

	private static void convertObjToXml(Organization org) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Organization.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		File xmlFile = new File("C:\\\\Users\\\\battula.padmavathi\\\\Documents\\\\Organization.xml");

		marshaller.marshal(org, xmlFile);
		System.out.println("Employee added to xml");

	}

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException, JAXBException {
		Connection connection = getConnection();// get db connection
		Organization org = new Organization();// create org object
		readDataFromDB(connection, org);// read data from db and assign to org
		convertObjToJson(org);// convert org to json
		convertObjToXml(org);// convert org to xml
		connection.close();
	}

}

package com.example.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.google.gson.Gson;

public class ConvertingJsonDataToDataBaseTable {
    public static void main(String[] args) throws ClassNotFoundException {
        String dbName = "organization"; // Update with your database name
        String userName = "postgres";
        String passWord = "postgres";
        String url = "jdbc:postgresql://localhost:5432/" + dbName;

        try (Reader reader = new FileReader("C:\\Users\\battula.padmavathi\\Documents\\employees.json")) {
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String json = sb.toString(); // This is the JSON content

            // Create the Gson object and parse the JSON
            Gson gson = new Gson();
            Organization emp = gson.fromJson(json, Organization.class);

            Class.forName("org.postgresql.Driver");
            try( Connection connection = DriverManager.getConnection(url, userName, passWord);) {


                connection.setAutoCommit(true); 

                String insertSql = "INSERT INTO employees (id, firstName, lastName, position, department, salary) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

                for (EmployeeDetails employee : emp.getEmployee()) {
                	System.out.println(employee);
                    preparedStatement.setInt(1, employee.getId());
                   preparedStatement.setString(2, employee.getFirstName());
                    preparedStatement.setString(3, employee.getLastName());
                    preparedStatement.setString(4, employee.getPosition());
                    preparedStatement.setString(5, employee.getDepartment());
                    preparedStatement.setDouble(6, employee.getSalary());

                    preparedStatement.executeUpdate();
                }

                preparedStatement.close();
                //connection.commit(); // Commit the transaction
                if(!emp.getEmployee().isEmpty()) {
                	System.out.println("Employees inserted successfully.");
                } else{
                	System.out.println("list is empty");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
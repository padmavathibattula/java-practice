package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedStatementExample {
	public void printFilmTable() {
		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("sakila");

		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String query
	            = "select * from sakila.film where release_year>=? and title=?";
	 
	        // Prepare Statement
	        PreparedStatement myStmt
	            = connection.prepareStatement(query);
	 
	        // Set Parameters
	        myStmt.setInt(1, 2006);
	        myStmt.setString(2, "ACADEMY DINOSAUR");
	 
	        // Execute SQL query
	        ResultSet rs = myStmt.executeQuery();
	 
	        System.out.println("release_year      title");
	 
	        // Display function to show the Resultset
	        while (rs.next()) {
	            String title = rs.getString("title");
	            int releaseyear = rs.getInt("release_year");
	            System.out.println(title + "     " + releaseyear);
	        }

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				
				
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		PreparedStatementExample obj=new PreparedStatementExample();
		obj.printFilmTable();
		
	}
}

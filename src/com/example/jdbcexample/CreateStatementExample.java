package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementExample {
	public void printLibraryTable() {
		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("library");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select title,publication_date from library.books");
			// step5:process result set
			while (rs.next()) {
				
				String title = rs.getString("title");
				String publicationDate = rs.getString("publication_date");

				System.out.println(String.format(" title=%s | publicationDate=%s ", title,
						publicationDate));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		CreateStatementExample obj = new CreateStatementExample();
		obj.printLibraryTable();

	}
}

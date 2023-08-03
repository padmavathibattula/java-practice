package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniverisityRepository {
	public void printStudentTable() {

		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("university");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from students limit 10");
			// step5:process result set
			while (rs.next()) {
				int studentId = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				System.out.println(String.format("studentId=%s | firstName=%s | lastName=%s | email=%s", studentId,
						firstName, lastName, email));
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
		UniverisityRepository obj = new UniverisityRepository();
		obj.printStudentTable();

	}
}

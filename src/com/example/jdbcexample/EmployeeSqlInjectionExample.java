package com.example.jdbcexample;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeSqlInjectionExample {
	public void getEmployeeIdByFistName() {
		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("employee");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			String fName="John' or '5' = '5";//
			rs = statement.executeQuery("select * from employees where first_name='"+fName+"'");
			// step5:process result set
			while (rs.next()) {
				String firstName = rs.getString(2);
				String lastName=rs.getString(3);
				System.out.println(firstName +" "+ lastName);
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
		EmployeeSqlInjectionExample obj = new EmployeeSqlInjectionExample();
		obj.getEmployeeIdByFistName();

	}

}

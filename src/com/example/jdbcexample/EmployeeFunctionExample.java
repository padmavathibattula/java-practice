package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class EmployeeFunctionExample {
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
			String user="Jane";
			rs = statement.executeQuery("select employee.get_employee_id_by_firstname('"+user+"') from dual");
			// step5:process result set
			while (rs.next()) {
				int empId = rs.getInt(1);
				System.out.println("employee id " + empId);
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
		EmployeeFunctionExample obj = new EmployeeFunctionExample();
		obj.getEmployeeIdByFistName();

	}

}

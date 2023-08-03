package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRepository {
	public void printAttendance() {
		Connection connection = MySqlDbConnection.getConnection("employee");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from attendance limit 10");
			// step5:process result set
			while (rs.next()) {
				int id = rs.getInt("id");
				int employeeId = rs.getInt("employee_id");
				String checkIn = rs.getString("check_in");
				String checkOut = rs.getString("check_out");
				System.out.println(String.format("id=%s | employeeId=%s | checkIn=%s | checkOut=%s", id,
					employeeId, checkIn, checkOut));
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
		EmployeeRepository obj=new EmployeeRepository();
		obj.printAttendance();
	}

}

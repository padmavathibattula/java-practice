package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementUsingFunctionExample {
	public void getEmployeeFirstName() {
		Connection connection = MySqlDbConnection.getConnection("employee");
		try (

				CallableStatement callbleStatement = connection
						.prepareCall("{? = call employee.get_employee_id_by_firstname(?)}");) {
			callbleStatement.registerOutParameter(1, Types.INTEGER);
			callbleStatement.setString(2, "john");
		
			callbleStatement.execute();
		
            System.out.println("employee id "+callbleStatement.getInt(1));
			callbleStatement.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		CallableStatementUsingFunctionExample obj=new CallableStatementUsingFunctionExample();
		obj.getEmployeeFirstName();
	}
	

}

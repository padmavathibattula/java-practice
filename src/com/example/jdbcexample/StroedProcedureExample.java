package com.example.jdbcexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StroedProcedureExample {
	public void getFilmCount() {
		Connection connection = MySqlDbConnection.getConnection("sakila");
		try (

				CallableStatement callbleStatement = connection
						.prepareCall("{call sakila.film_in_stock(?,?,?)}");) {

			callbleStatement.setInt(1, 1);
			callbleStatement.setInt(2, 1);
			callbleStatement.registerOutParameter(3, Types.INTEGER);

			callbleStatement.execute();
			int filmCount = callbleStatement.getInt(3);
			System.out.println(filmCount);

			callbleStatement.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}
	public static void main(String[] args) {
		StroedProcedureExample obj =new StroedProcedureExample();
		obj.getFilmCount();
	}

}

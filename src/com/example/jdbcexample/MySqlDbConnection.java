package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDbConnection {
	public static Connection getConnection() {
		String userName = "root";
		String passWord = "root";
		String url = "jdbc:mysql://localhost:3306/sakila";

		Connection connection = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2:establish the connection
			connection = DriverManager.getConnection(url, userName, passWord);
		} catch (SQLException | ClassNotFoundException e) {

		}
		return connection;
	}

	public static void printActorTable() {
		// step2:establish the connection
		Connection connection = getConnection();

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from actor limit 10");
			// step5:process result set
			while (rs.next()) {
				int actorId = rs.getInt("actor_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				System.out.println(
						String.format("actorId=%s | firstName=%s | lastName=%s", actorId, firstName, lastName));
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

	public static void printFilmTable() {
		// step2:establish the connection
		Connection connection = getConnection();

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from film limit 10");
			// step5:process result set
			while (rs.next()) {
				int filmId = rs.getInt("film_id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				String date = rs.getString("release_year");
				int length = rs.getInt("length");
				System.out.println(String.format("filmId=%s | title=%s | description=%s | date=%s | length=%s ", filmId,
						title, description, date, length));
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
		MySqlDbConnection.printActorTable();
		MySqlDbConnection.printFilmTable();

	}

}

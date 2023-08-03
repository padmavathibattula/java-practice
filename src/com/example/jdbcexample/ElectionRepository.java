package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ElectionRepository {
	public void printCandiateTable() {
		// step2:establish the connection
		Connection connection = MySqlDbConnection.getConnection("election");

		Statement statement = null;
		ResultSet rs = null;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			rs = statement.executeQuery("select * from election.candiate");
			// step5:process result set
			while (rs.next()) {
				int candiateId = rs.getInt("candidate_id");
				String candiateName = rs.getString("candidate_name");
				String partyName = rs.getString("party_name");
				String constituency = rs.getString("constituency");
				System.out.println(String.format("candiateId=%s | candiateName=%s | partyName=%s | constituency=%s",
						candiateId, candiateName, partyName, constituency));
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

public void insertElectionTable() {
	
		Connection connection = MySqlDbConnection.getConnection("election");

		Statement statement = null;
		int count = 0;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			count = statement.executeUpdate("insert into election.candiate(candiate_id,candiate_Name,party_Name,constituency) values(9,'padma','Independent','Constituency')");
			// step5:process result set
			System.out.println(String.format("The inserted election table:%s",count));
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
	public void updateElectionTable() {
		Connection connection = MySqlDbConnection.getConnection("election");

		Statement statement = null;
		int count = 0;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			count = statement.executeUpdate("update election.candiate set party_Name='Green party' where id=10");
			// step5:process result set
			System.out.println(String.format("The updated election table:%s",count));
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void deleteElectionTable() {
		Connection connection = MySqlDbConnection.getConnection("election");

		Statement statement = null;
		int count = 0;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			count = statement.executeUpdate("delete from election.candiate where id=16");
			// step5:process result set
			System.out.println(String.format("The deleted election table:%s",count));
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// step6:close the resources
			try {
				
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {

		ElectionRepository obj = new ElectionRepository();
	    // obj.printCandiateTable();
		obj.insertElectionTable();
		obj.updateElectionTable();
		obj.deleteElectionTable();
	}
	


}


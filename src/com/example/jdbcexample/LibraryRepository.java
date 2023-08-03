package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryRepository {
	public void printAuthorTable() {
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
			rs = statement.executeQuery("select * from authors");
			// step5:process result set
			while (rs.next()) {
				int authorId = rs.getInt("id");
				String authorName = rs.getString("author_name");
				System.out.println(String.format("authorId=%s | authorName=%s", authorId, authorName));
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
	public  void insertMemberTable() {
		Connection connection = MySqlDbConnection.getConnection("library");

		Statement statement = null;
		int count = 0;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			count = statement.executeUpdate("insert into library.members(member_name,email,address) values('padma','padmavathi.batula95@gmail.com','1234MainStreet')");
			// step5:process result set
			System.out.println(String.format("The inserted member tanble:%s",count));
			

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
	public void updateMemberTable() {
		Connection connection = MySqlDbConnection.getConnection("library");

		Statement statement = null;
		int count = 0;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			count = statement.executeUpdate("update library.members set address='1345 Hyderabad'where id=16");
			// step5:process result set
			System.out.println(String.format("The updated member table:%s",count));
			

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
	public void deleteMemberTable() {
		Connection connection = MySqlDbConnection.getConnection("library");

		Statement statement = null;
		int count = 0;
		try {
			// step1:load the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step3:create a sql statement
			statement = connection.createStatement();
			// step4:execute the query
			count = statement.executeUpdate("delete from library.members where id=16");
			// step5:process result set
			System.out.println(String.format("The deleted member table:%s",count));
			

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
	public void printMemberTable() {
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
					rs = statement.executeQuery("select * from members");
					// step5:process result set
					while (rs.next()) {
						int id = rs.getInt("id");
						String memberName = rs.getString("member_name");
						String email=rs.getString("email");
						String address=rs.getString("address");
						System.out.println(String.format("id=%s | memberName=%s| email=%s | address=%s", id, memberName,email,address));
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

		LibraryRepository obj = new LibraryRepository();
		obj.printMemberTable();
		//obj.printAuthorTable();
		//obj.insertMemberTable();
		//obj.updateMemberTable();
		//obj.deleteMemberTable();
	}
	

}

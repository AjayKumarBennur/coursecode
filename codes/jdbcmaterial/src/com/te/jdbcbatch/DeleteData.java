package com.te.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractise?user=root&password=root");
			Statement createStatement = connection.createStatement();
			int executeUpdate = createStatement.executeUpdate("delete from employees where empid = 1");
			System.out.println(executeUpdate);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

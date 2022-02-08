package com.te.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoPrepared {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractise","root","root");
			PreparedStatement prepareStatement = connection.prepareStatement("Insert into employees values(?,?,?,?,?)");
			prepareStatement.setInt(1,2);
			prepareStatement.setString(2, "Kumar");
			prepareStatement.setInt(3, 25);
			prepareStatement.setString(4, "Tester");
			prepareStatement.setDouble(5, 30000);
			int executeUpdate = prepareStatement.executeUpdate();			
			System.out.println(executeUpdate);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

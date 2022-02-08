package com.te.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchingData {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractise","root","root");
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery("Select * from employees");
			while (executeQuery.next()) {
				System.out.print(executeQuery.getInt(1)+",");
				System.out.print(executeQuery.getString(2)+",");
				System.out.print(executeQuery.getInt(3)+",");
				System.out.print(executeQuery.getString(4)+",");
				System.out.println(executeQuery.getDouble(5));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

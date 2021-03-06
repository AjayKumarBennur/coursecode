package com.te.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;
		try {
			/*
			 * This method caused tight coupling
			 */
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcpractise?user=root&password=root");
			createStatement = connection.createStatement();
			boolean execute = createStatement.execute(
					"create table employees (empID int,name varchar(40),age int,designation varchar(40),salary double);");
			System.out.println(execute);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

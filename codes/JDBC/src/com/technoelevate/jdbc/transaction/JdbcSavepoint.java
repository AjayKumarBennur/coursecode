package com.technoelevate.jdbc.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcSavepoint {
	public static void main(String[] args) {

		Savepoint sp = null;
		Savepoint sp2 = null;
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");
			Statement createStatement = connection.createStatement();
			connection.setAutoCommit(false);
			createStatement.executeUpdate("Insert into student values (100,'Manju','Angular')");
			System.out.println("=== 1st==");
			createStatement.executeUpdate("Update student set subject='java' where roll_no=3");
			System.out.println("=== 2nd==");

			sp=connection.setSavepoint();
			System.out.println("=== savepoint==");
			createStatement.executeUpdate("Update student set subject='security' where roll_no=2");
			System.out.println("=== 3rd==");
			sp2 = connection.setSavepoint();
			createStatement.executeUpdate("Update student set subject='jdbc' where roll_no='www'");
			System.out.println("===4th==");
			connection.commit();
			System.out.println("All Data committed");
			
		} catch (ClassNotFoundException | SQLException e) {
			if(e instanceof SQLException) {
				try {
					connection.rollback(sp2);
					connection.commit();
					System.out.println("Data rollback after savepoint");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}
}

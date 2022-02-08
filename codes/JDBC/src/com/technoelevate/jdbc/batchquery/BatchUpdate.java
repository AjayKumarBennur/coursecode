package com.technoelevate.jdbc.batchquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BatchUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");
			Statement createStatement = connection.createStatement();
			createStatement.addBatch("Insert into student values(1,'AjayKumar','Hibernate')");
			System.out.println("======1st========");
			
			createStatement.addBatch("Update Student set subject='Angular' where roll_no=3");
			System.out.println("======2nd========");
			
			createStatement.addBatch("Delete from Student where roll_no=2");
			System.out.println("======3rd========");
			
			int[] executeBatch = createStatement.executeBatch();
			System.out.println(executeBatch);
			
			for (int i : executeBatch) {
				System.out.println(i);
			}
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
}

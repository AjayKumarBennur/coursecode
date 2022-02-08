package com.te.jdbcbatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInto {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractise","root","root");
			Statement createStatement = connection.createStatement();//platform is created 
			int executeUpdate = createStatement.executeUpdate("Insert into employees values (1,'Ajay',21,'Software Developer',12000);");
			System.out.println(executeUpdate);			
		}catch(ClassNotFoundException|SQLException c) {
			c.printStackTrace();		
		}
	}
}

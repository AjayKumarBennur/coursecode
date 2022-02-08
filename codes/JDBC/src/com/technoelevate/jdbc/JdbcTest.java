package com.technoelevate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");
			Statement statement = con.createStatement();
			con.setAutoCommit(false);
			System.out.println("Auto commit has been disabled ");
			statement.executeUpdate("Update student set subject ='css' where roll_no=1");
			System.out.println("query1 executed");
			statement.executeUpdate("Update student set subject='Html' where roll_no = 2");
			System.out.println("query 2 executed");
			con.commit();
			System.out.println("data commited");
		} catch (SQLException e ) {
			e.printStackTrace();
		}
		
	}
}

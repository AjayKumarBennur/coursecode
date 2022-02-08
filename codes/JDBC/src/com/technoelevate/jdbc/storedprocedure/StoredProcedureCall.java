package com.technoelevate.jdbc.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedureCall {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");
			CallableStatement prepareCall = connection.prepareCall("Call addStudent(?,?,?)");
			prepareCall.setInt(1, 7);
			prepareCall.setString(2, "Siddu");
			prepareCall.setString(3, "React Native");
			prepareCall.execute();
			System.out.println("Called the procedure");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

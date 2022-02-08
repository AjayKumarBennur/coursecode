package com.te.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;

public class CallProcedure {
	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement prepareStatement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
//			prepareStatement = connection.prepareCall("Call maxPriceOfsweet(?)");
//			prepareStatement.registerOutParameter(1, JDBCType.DOUBLE);
			CallableStatement prepareCall = connection.prepareCall("Call costlySweets(?)");
			prepareCall.registerOutParameter(1, JDBCType.VARCHAR);
			System.out.println(prepareCall.getString(1));
//			boolean execute= prepareStatement.execute();
//			System.out.println(prepareStatement.getDouble(1));
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}

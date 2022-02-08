package com.te.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		Savepoint savepoint = null;
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			statement.execute("Insert into transaction values(1,'account opened')");
			statement.execute("Insert into transaction values(2,'pin enteres correctly')");
			System.out.println("Done the with upi");
			statement.execute("Insert into transaction values(3,'debited')");
			savepoint = connection.setSavepoint();
			statement.execute("Insert into transaction values(4,'over the network')");
			statement.execute("Insert into transaction values(5,'credite to account')");
			System.out.println("Transaction occured successfully");
			connection.commit();
		} catch (SQLException e) {
			// e.printStackTrace();
			if (e instanceof SQLException) {
				try {
					connection.rollback(savepoint);
					connection.commit();
					System.out.println("Transaction failed");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}

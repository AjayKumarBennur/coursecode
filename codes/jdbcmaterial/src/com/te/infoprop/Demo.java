package com.te.infoprop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Demo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			FileReader file = new FileReader("C:\\Users\\Ajay\\Desktop\\credentials.txt");
			Properties properties = new Properties();
			properties.load(file);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", properties);
			Statement createStatement = connection.createStatement();
			createStatement.addBatch("insert into student values(1,'Ajay','JDBC')");
			createStatement.addBatch("delete from student where subject='jdbc'");
			createStatement.addBatch("insert into student values(2,'Hacker','Angular')");
			createStatement.addBatch("alter table student rename to mentor");
			createStatement.executeBatch();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

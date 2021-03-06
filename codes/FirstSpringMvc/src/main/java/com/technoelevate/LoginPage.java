package com.technoelevate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.technoelevate.pojo.Login;

public class LoginPage extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Login login = new Login();
		login.setName(username);
		login.setPassword(password);
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction transaction = openSession.getTransaction();
		System.out.println(login.getName());
		transaction.begin();
		openSession.save(login);
		transaction.commit();
		openSession.close();
		buildSessionFactory.close();
	}

}

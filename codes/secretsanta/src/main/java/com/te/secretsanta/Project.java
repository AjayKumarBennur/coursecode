package com.te.secretsanta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Project extends HttpServlet {
	
	List<String> list = new LinkedList<>();
	static int count;
	public void emp() {
		list.add("Ajay");
		list.add("Kumar");
		list.add("Bennur");
		list.add("ssup");
		count =count+1;
	}
	
	public String name() {
		int i = (int)(Math.random()*list.size());
		return list.remove(i);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(count==0) {
			this.emp();			
		}
		String name = this.name();
		PrintWriter writer = resp.getWriter();
		writer.write(name);
		
	}
}

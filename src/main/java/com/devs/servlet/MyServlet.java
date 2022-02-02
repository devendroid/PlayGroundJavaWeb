package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
This is to just demonstrate the lifecycle of a Servlet,
Servlet is a interface that have 3lifecycle methods and 2 other methods. 
*/

public class MyServlet implements Servlet {
	
	ServletConfig conf;
	

	// LifeCycle Methods
	
	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf = conf;
		System.out.println("===init(): Creating Objects");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("===service(): Serving...");
		resp.setContentType("text/html");
		PrintWriter out =  resp.getWriter();
		out.println("<h1>This is output from Servlet method</h1>");
		out.println("<h1>Today Date Time: "+new Date().toString()+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("===destroy(): Destroying Objects");
	}
	
	//Non LifeCycle Methods

	@Override
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "This Servlet is just to demonstrate LifeCycle methods";
	}

	



}

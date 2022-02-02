package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This is to just demonstrate a GenericServlet, 
 * "GenericServlet" is a abstract class that implements "Servlet" interface 
 * and provide the body for all 4 methods excepts 1 service method 
 */
public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("===service(): Serving...");
		resp.setContentType("text/html");
		PrintWriter out =  resp.getWriter();
		out.println("<h1>This is output from GenericServlet method</h1>");
		out.println("<h1>Today Date Time: "+new Date().toString()+"</h1>");
	}

}

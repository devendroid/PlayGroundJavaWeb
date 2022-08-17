package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This HttpServlet is to just demonstrate request forward to other HttpServlet 
 * using RequestDispatcher by setting attributes in request object,
 * this can be call from both methods either get or post
 */
public class ServletA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		resp.setContentType("text/html");
		try (PrintWriter out =  resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			
			out.println("<head>");
			out.println("<title> ServletA </title>");
			out.println("</head>");
			
			out.println("<body>");
			String name = req.getParameter("name");
			out.println("<h1>Hello "+name+" Welcome to my website..</h1>");
			out.println("<h1><a href='ServletB'>Go to Servlet B</a></h1>");
			out.println("</body>");
			
			out.println("</html>");
			
			// Set cookies
			Cookie cookie = new Cookie("user_name", name);
			resp.addCookie(cookie);
			
		}
	
	}

}

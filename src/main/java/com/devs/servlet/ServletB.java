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
public class ServletB extends HttpServlet {

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
			String name = "";
			
			// Getting all cookies
			Cookie[] cookies = req.getCookies();
			for(Cookie c : cookies) {
				if(c.getName().equals("user_name")) {
					name = c.getValue();
					break;
				}
			}
			
			if(!name.equals("")) {
				out.println("<h1>Hello "+name+" Welcome back to my website..</h1>");
				out.println("<h1>Thankyou!</h1>");
			} else {
				out.println("<h1>Looks like you are a new user, please first submit your name</h1>");
			}
			
			
			out.println("</body>");
			
			out.println("</html>");
		}
	
	}

}

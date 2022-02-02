package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * This HttpServlet is to just demonstrate request receive from other HttpServlet 
 * by getting attributes in request object,
 * this can be call from both methods either get or post
 */
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		PrintWriter out =  resp.getWriter();
		
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		int sum = (int) req.getAttribute("sum");
		int mul = n1 * n2;
		
		out.println("<h3>N1 = "+n1+"</h3>");
		out.println("<h3>N2 = "+n2+"</h3>");
		out.println("<h2>(N1+N2) from Servlet1 = "+sum+"</h2>");
		out.println("<h2>(N1xN2) from Servlet2 = "+mul+"</h2>");
		
	}

}

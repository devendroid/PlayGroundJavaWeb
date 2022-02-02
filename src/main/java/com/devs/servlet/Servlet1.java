package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This HttpServlet is to just demonstrate request forward to other HttpServlet 
 * using RequestDispatcher by setting attributes in request object,
 * this can be call from both methods either get or post
 */
public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		int s = n1 + n2;
		req.setAttribute("sum", s);
		
		RequestDispatcher rd = req.getRequestDispatcher("Servlet2");
		rd.forward(req, resp);
	
	}

}

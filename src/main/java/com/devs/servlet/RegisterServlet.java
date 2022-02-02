package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This HttpServlet is to just demonstrate the doPost method 
 * for how we get a inputs from a form by get method.
 */
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out =  resp.getWriter();
		out.println("<h1>Welcome to Register servlet</h1>");
		String name = req.getParameter("full_name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String tnc = req.getParameter("tnc");
		
		out.println("<h2>Name: "+name+"</h2>");
		out.println("<h2>Email: "+email+"</h2>");
		out.println("<h2>Password: "+password+"</h2>");
		out.println("<h2>Gender: "+gender+"</h2>");
		out.println("<h2>Course: "+course+"</h2>");
		out.println("<h2>TnC: "+(tnc != null)+"</h2>");
	}

}

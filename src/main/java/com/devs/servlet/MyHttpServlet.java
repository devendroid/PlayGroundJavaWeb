package com.devs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This is to just demonstrate a HttpServlet, 
 * "HttpServlet" is a class that extends "GenericServlet" class 
 * and provide the body for remaining 1 method service and provide methods like doGet, doPost etc
 * to be override by its child class. 
 */
public class MyHttpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===doGet(): This is get method");
		resp.setContentType("text/html");
		PrintWriter out =  resp.getWriter();
		out.println("<h1>This is my first HttpServlet using eclipse and tomcat</h1>");
	}

}

package com.xworkz.toy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/form")
public class ToyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		writer.print("<form action='form' method='post'>");
		writer.print("Name:<input type='text' name='name' >");
		writer.print("Email: <input type='text' name='email'>");
		writer.print("<button type='submit' name='submit'>submit</button>");
		writer.print("</body></html");
		
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		writer.print("<h1>submitted data</h1>");
		writer.print(name);
		writer.print(email);
		writer.print("</body></html>");
		System.out.println("Name :"+name);
		System.out.println("Email:"+ email);
		
		
	}
	
	
	
}

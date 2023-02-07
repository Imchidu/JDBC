package com.xworkz.hostel;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet")
public class HostelServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<h1> This is first Servlet</h1>");
		
		//request.getRequestDispatcher("servlet2").forward(request, response);
		
		request.getRequestDispatcher("/servlet2").include(request, response);
		
		
		
	}

}

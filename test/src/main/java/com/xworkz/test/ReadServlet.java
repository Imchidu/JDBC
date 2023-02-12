package com.xworkz.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.test.dto.TestDto;
import com.xworkz.test.service.TestService;
import com.xworkz.test.service.TestServiceImpl;

@WebServlet(value = "/read")
public class ReadServlet extends HttpServlet{
	
	TestService service=new TestServiceImpl();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		List<TestDto> readAll = service.readAll();
		writer.print("<table>");
		
		for (TestDto dto : readAll) {
			
			writer.print("<tr><td>");
			writer.print(dto.getName());
			writer.print("</td>");
			
			
			writer.print("<td>");
			writer.print(dto.getLocation());
			writer.print("</td>");
			
			writer.print("<td>");
			writer.print(dto.getNoOfStudents());
			writer.print("</td>");
			
			writer.print("<td>");
			writer.print(dto.getDuration());
			writer.print("</td></tr>");
			writer.print("</table>");
			
			
			
	
			
			
		}
	
		
	}

}

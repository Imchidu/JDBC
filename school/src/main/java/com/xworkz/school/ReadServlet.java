package com.xworkz.school;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.school.DTO.SchoolDTO;
import com.xworkz.school.service.SchoolService;
import com.xworkz.school.service.SchoolServiceImpl;

@WebServlet(value = "/read")
public class ReadServlet extends HttpServlet{
	SchoolService service=new SchoolServiceImpl();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		List<SchoolDTO> readAll = service.readAll();
		writer.print("<table>");
		
		for (SchoolDTO dto : readAll) {
			writer.print("<tr><td>");
			writer.print(dto.getName());
			writer.print("</td>");
			
			
			writer.print("<td>");
			writer.print(dto.getLocation());
			writer.print("</td>");
			
			writer.print("<td>");
			writer.print(dto.getNoOfStudents());
			writer.print("</td></tr>");
			writer.print("</table>");
			
			
			
			
		}
		
	}

}

package com.xworkz.school;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.school.DTO.SchoolDTO;
import com.xworkz.school.service.SchoolService;
import com.xworkz.school.service.SchoolServiceImpl;

@WebServlet(value = "/save")
public class SchoolServlet extends HttpServlet {

	SchoolService service = new SchoolServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <style>\r\n"
				+ "        div {\r\n" + "            text-align: center;\r\n" + "            padding-bottom: 20px;\r\n"
				+ "        }\r\n" + "\r\n" + "\r\n" + "        input {\r\n" + "            text-align: center;\r\n"
				+ "\r\n" + "        }\r\n" + "\r\n" + "        h1 {\r\n" + "            text-align: center;\r\n"
				+ "        }\r\n" + "    </style>\r\n" + "    <title></title>\r\n" + "\r\n" + "</head>\r\n" + "\r\n"
				+ "<body>\r\n" + "    <h1>STUDENTS_DETAILS</h1>\r\n" + "    <form action=\"save\" method=\"Post\">\r\n"
				+ "\r\n" + "        <div> <input type=\"text\" name=\"name\" placeholder=\"name\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"location\" placeholder=\"location\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"noOfStudents\" placeholder=\"noOfStudents\" /></div>\r\n"
				+ "       \r\n" + "        <div><button type=\"submit\">ENTER</button></div>\r\n" + "\r\n"
				+ "    </form>\r\n" + "</body>\r\n" + "\r\n" + "</html>\r\n" + "");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String noOfStudents = request.getParameter("noOfStudents");

		SchoolDTO dto = new SchoolDTO();
		dto.setName(name);
		dto.setLocation(location);
		dto.setNoOfStudents(noOfStudents);

		service.save(dto);

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

	}

}

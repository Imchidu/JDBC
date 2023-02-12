package com.xworkz.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.test.dto.TestDto;
import com.xworkz.test.service.TestService;
import com.xworkz.test.service.TestServiceImpl;

@WebServlet(value = "/save")
public class TestServlet extends HttpServlet {

	TestService service = new TestServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <style>\r\n"
				+ "        div {\r\n" + "            text-align: center;\r\n" + "            padding-bottom: 20px;\r\n"
				+ "        }\r\n" + "\r\n" + "\r\n" + "        input {\r\n" + "            text-align: center;\r\n"
				+ "\r\n" + "        }\r\n" + "\r\n" + "        h1 {\r\n" + "            text-align: center;\r\n"
				+ "        }\r\n" + "    </style>\r\n" + "    <title></title>\r\n" + "\r\n" + "</head>\r\n" + "\r\n"
				+ "<body>\r\n" + "    <h1>TEST_DETAILS</h1>\r\n" + "    <form action=\"save\" method=\"Post\">\r\n"
				+ "\r\n" + "        <div> <input type=\"text\" name=\"name\" placeholder=\"name\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"location\" placeholder=\"location\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"noOfStudents\" placeholder=\"noOfStudents\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"duration\" placeholder=\"duration\" /></div>\r\n"
				+ "        <div><button type=\"submit\">ENTER</button></div>\r\n" + "\r\n" + "    </form>\r\n"
				+ "</body>\r\n" + "\r\n" + "</html>\r\n" + "");

		
		request.getRequestDispatcher("/read").include(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String noOfStudents = request.getParameter("noOfStudents");
		String duration = request.getParameter("duration");

		TestDto dto = new TestDto(name, location, noOfStudents, duration);

		String save = service.save(dto);
		System.out.println(save);

		List<TestDto> readall = service.readAll();
		System.out.println(readall);

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

	}
}

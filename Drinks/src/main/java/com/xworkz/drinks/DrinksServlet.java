package com.xworkz.drinks;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.drinks.dto.DrinksDto;
import com.xworkz.drinks.repo.DrinksService;
import com.xworkz.drinks.repo.DrinksServiceImpl;

@WebServlet(value = "/save")
public class DrinksServlet extends HttpServlet {
	
	DrinksService service = new DrinksServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <style>\r\n"
				+ "        div {\r\n" + "            text-align: center;\r\n" + "            padding-bottom: 20px;\r\n"
				+ "        }\r\n" + "\r\n" + "\r\n" + "        input {\r\n" + "            text-align: center;\r\n"
				+ "\r\n" + "        }\r\n" + "\r\n" + "        h1 {\r\n" + "            text-align: center;\r\n"
				+ "        }\r\n" + "    </style>\r\n" + "    <title></title>\r\n" + "\r\n" + "</head>\r\n" + "\r\n"
				+ "<body>\r\n" + "    <h1>STUDENTS_DETAILS</h1>\r\n" + "    <form action=\"save\" method=\"Post\">\r\n"
				+ "\r\n" + "        <div> <input type=\"text\" name=\"brand\" placeholder=\"brand\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"price\" placeholder=\"price\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"color\" placeholder=\"color\" /></div>\r\n" + "       \r\n"
				+ "        <div><button type=\"submit\">ENTER</button></div>\r\n" + "\r\n" + "    </form>\r\n"
				+ "</body>\r\n" + "\r\n" + "</html>\r\n" + "");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String brand = request.getParameter("brand");
		String price = request.getParameter("price");
		String color = request.getParameter("color");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		DrinksDto dto = new DrinksDto( brand, price, color);
		boolean save = service.save(dto);
		System.out.println(save);
		writer.print(save);
		

	}
}

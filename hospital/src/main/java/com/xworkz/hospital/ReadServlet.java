package com.xworkz.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

@WebServlet(value = "/read")
public class ReadServlet extends HttpServlet {
	HospitalService service = new HospitalServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		List<HospitalDTO> readall = service.readAll();
		writer.print("<table>");
		for (HospitalDTO dto : readall) {
			writer.print("<tr><td>");
			writer.print(dto.getName());
			writer.print("</td>");

			writer.print("<td>");
			writer.print(dto.getLocation());
			writer.print("</td>");

			writer.print("<td>");
			writer.print(dto.getNoOfPatients());
			writer.print("</td>");

			writer.print("<td>");
			writer.print(dto.getNoOfDoctors());
			writer.print("</td>");

			writer.print("<td>");
			writer.print(dto.getNoOfNurse());
			writer.print("</td>");

			writer.print("<td>");
			writer.print(dto.getNoOfBeds());
			writer.print("</td></tr>");

		}

		writer.print("</table>");

	}

}

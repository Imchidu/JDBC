package com.xworkz.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

@WebServlet(value = "/save")
public class HospitalServlet extends HttpServlet {

	private HospitalService service = new HospitalServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <style>\r\n"
				+ "        div {\r\n" + "            text-align: center;\r\n" + "            padding-bottom: 20px;\r\n"
				+ "        }\r\n" + "\r\n" + "\r\n" + "        input {\r\n" + "            text-align: center;\r\n"
				+ "\r\n" + "        }\r\n" + "\r\n" + "        h1 {\r\n" + "            text-align: center;\r\n"
				+ "        }\r\n" + "    </style>\r\n" + "    <title></title>\r\n" + "\r\n" + "</head>\r\n" + "\r\n"
				+ "<body>\r\n" + "    <h1>HOSPITAL_DETAILS</h1>\r\n" + "    <form action=\"save\" method=\"Post\">\r\n"
				+ "\r\n" + "        <div> <input type=\"text\" name=\"name\" placeholder=\"name\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"location\" placeholder=\"location\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"noOfPatients\" placeholder=\"noOfPatients\" /></div>\r\n"
				+ "        <div><input type=\"text\" name=\"noOfDoctors\" placeholder=\"noOfDoctors\" /></div>\r\n"
				+ "        <div> <input type=\"text\" name=\"noOfBeds\" placeholder=\"noOfBeds\" /></div>\r\n"
				+ "        <div><input type=\"text\" name=\"noOfNurse\" placeholder=\"noOfNurse\" /></div>\r\n"
				+ "        <div><button type=\"submit\">CreateAccount</button></div>\r\n" + "\r\n" + "    </form>\r\n"
				+ "</body>\r\n" + "\r\n" + "</html>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {

		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String noOfPatient = request.getParameter("noOfPatients");
		String noOfDoctors = request.getParameter("noOfDoctors");
		String noOfBeds = request.getParameter("noOfBeds");
		String noOfNurse = request.getParameter("noOfNurse");

		HospitalDTO hospitalDTO = new HospitalDTO();
		System.out.println(noOfPatient);

		hospitalDTO.setName(name);
		hospitalDTO.setLocation(location);
		hospitalDTO.setNoOfPatients(noOfPatient);
		hospitalDTO.setNoOfDoctors(noOfDoctors);
		hospitalDTO.setNoOfBeds(noOfBeds);
		hospitalDTO.setNoOfNurse(noOfNurse);

		try {
			service.validateAndsave(hospitalDTO);
		} catch (Exception e) {
			System.out.println("first step");
			e.printStackTrace();
		}

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
	

	}

}

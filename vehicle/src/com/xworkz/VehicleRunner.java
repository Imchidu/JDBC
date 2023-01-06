package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class VehicleRunner {

	public static void main(String[] args) {

		String userName = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/educaticational_institute";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(host, userName, password);

			String query = "Insert Into new_table1 Values(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 2);
			statement.setString(2, "honda");
			statement.setString(3, "55000");
			statement.setString(4, "black");
			statement.setString(5, "fiftyfive");

			statement.executeUpdate();
			
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}

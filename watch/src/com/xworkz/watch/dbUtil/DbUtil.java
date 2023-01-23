package com.xworkz.watch.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.watch.constants.SqlCredentials;

public class DbUtil {
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(), SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());
			
			return connection;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}

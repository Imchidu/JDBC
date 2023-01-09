package com.xworkz.tree.Repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.tree.Dto.TreeDto;

public class TreeRepoImpl implements TreeRepo {

	@Override
	public boolean save(TreeDto dto) {

		String userName = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/jdbc";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	Connection	connection=DriverManager.getConnection(host, userName, password);
	
	String query="insert into Tree_Details values(?,?,?,?,?,?,?,?,?,?)";
	
	PreparedStatement statement = connection.prepareStatement(query);
	
	statement.setString(1, dto.getName());
	statement.setString(2, dto.getType());
	statement.setString(3, dto.getColorOfLeaves());
	statement.setInt(4, dto.getCostoftree());
	statement.setInt(5, dto.getNoOfBranch());
	statement.setInt(6, dto.getLifeOfTree());
	statement.setString(7, dto.getColorofstem());
	statement.setInt(8, dto.getLength());
	statement.setInt(9, dto.getWidth());
	statement.setInt(10, dto.getHeight());
	
	
	statement.executeUpdate();
	statement.close();
	connection.close();
	
	
	
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}



}

package com.xworkz.shirt.repo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.shirt.dbUtil.DbUtil;
import com.xworkz.shirt.dto.ShirtDto;

public class ShirtRepoImpl implements ShirtRepo {

	@Override
	public boolean save(ShirtDto dto) {

		String query = "insert into Shirtdetails values(?,?,?,?,?)";
		Connection connection = DbUtil.getConnection();

		try {

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getColor());
			statement.setString(4, dto.getSize());
			statement.setBoolean(5, dto.isHasPocket());

			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<ShirtDto> readAll() {

		String query = "select * from Shirtdetails";

		Connection connection = DbUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(query);

			List<ShirtDto> list = new ArrayList<ShirtDto>();
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				int id = set.getInt("id");
	
				String name = set.getString("brandName");
				String color = set.getString("color");
				String size = set.getString("size");
				boolean hasPocket = set.getBoolean("hasPocket");

				ShirtDto dto = new ShirtDto(id, name, color, size, hasPocket);

				boolean add = list.add(dto);
				System.out.println(add);

			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ShirtDto findByName(String name) {
  
		String query= "select * from Shirtdetails where brandName=?";
		
		Connection connection = DbUtil.getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			
		statement.setString(1, name);
		ResultSet set= statement.executeQuery();
		while(set.next()) {
			int id= set.getInt(1);
			String brandName= set.getString(2);
			String color=set.getString(3);
			String size=set.getString(4);
			boolean hasPocket=set.getBoolean(5);
			
			ShirtDto dto=new ShirtDto(id, brandName, color, size, hasPocket);
			return dto;
			
			
		}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ShirtDto updatesizeByName(String size, String name) {

		String query="update Shirtdetails set size=? where brandname=?";
		
		Connection connection = DbUtil.getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, size);
			statement.setString(2, name);
			
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}





	

	@Override
	public boolean deletebybrandName(String name) {
		String query="Delete from Shirtdetails where brandName=?";
		  
		  Connection connection = DbUtil.getConnection();
		  try {
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, name);
			
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return false;
	}

	
	

}

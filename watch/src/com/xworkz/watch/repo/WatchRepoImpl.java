package com.xworkz.watch.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.watch.dbUtil.DbUtil;
import com.xworkz.watch.dto.WatchDto;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public boolean saveAll(WatchDto dto) {
 
		String query ="insert into Watchdetails values(?,?,?,?,?)";
		
		try(Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);)
		{
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getColor());
			statement.setString(4, dto.getType());
			statement.setInt(5, dto.getPrice());
		
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

}

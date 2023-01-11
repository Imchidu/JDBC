package com.xworkz.soap.repo;

import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;
import com.xworkz.soap.constants.SqlCredentials;
import com.xworkz.soap.dto.SoapDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),
					SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());

			String query = "INSERT INTO SoapDetals VALUES(?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getPrice());
			statement.setString(4, dto.getColor());
			statement.setString(5, dto.getFragrance());
			statement.setInt(6, dto.getWeight());
			statement.setInt(7, dto.getMfg());
			statement.setString(8, dto.getType());

			int executeUpdate = statement.executeUpdate();

			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public List<SoapDto> read() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),
					SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());
			String query = "select * FROM SoapDetals";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int id = set.getInt("id");
				String name = set.getString("name");
				int price = set.getInt("price");
				String colour = set.getString("colour");
				String fragrance = set.getString("fragrance");
				int wt = set.getInt("weight");
				int mfg = set.getInt("mfgdate");
				String type = set.getString("type");

				SoapDto dto = new SoapDto(id, name, price, colour, fragrance, wt, mfg, type);
				System.out.println(dto);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto findByNameAndPrice(String name, int price) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),
					SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());
		String query="select * from SoapDetals where name=? and price=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1,name);
		statement.setInt(2, price);
		ResultSet set = statement.executeQuery();
		while(set.next()) {
			int id = set.getInt("id");
			String name1 = set.getString("name");
			int price1 = set.getInt("price");
			String colour = set.getString("colour");
			String fragrance = set.getString("fragrance");
			int wt = set.getInt("weight");
			int mfg = set.getInt("mfgdate");
			String type = set.getString("type");

			SoapDto dto = new SoapDto(id, name1, price1, colour, fragrance, wt, mfg, type);
			System.out.println(dto);
		}
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public SoapDto updateNameByPrice(String name, int price) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),
					SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());
			String query = "update SoapDetals set name=? where price=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, name);
			statement.setInt(2, price);
			int set = statement.executeUpdate();

			

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto updateColourAndFragranceByName(String colour, String fragrance, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),
					SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());
			String query = "update SoapDetals set colour=?,fragrance=? where name=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, colour);
			statement.setString(2, fragrance);
			statement.setString(3, name);
			int set = statement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto updateTypeById(String type, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),
					SqlCredentials.USERNAME.getValues(), SqlCredentials.PASSWORD.getValues());
			String query = "update SoapDetals set type=? where id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1,type);
			statement.setInt(2,id);
			int set = statement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;
	}


}

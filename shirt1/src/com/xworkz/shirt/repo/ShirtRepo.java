package com.xworkz.shirt.repo;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;

public interface ShirtRepo {
	
	public boolean save(ShirtDto dto);
	
	public List<ShirtDto> readAll();
	
	public ShirtDto findByName(String name);
	
	public ShirtDto updatesizeByName(String size,String name);
	

	

	public boolean deletebybrandName(String name);

}

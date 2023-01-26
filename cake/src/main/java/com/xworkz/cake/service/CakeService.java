package com.xworkz.cake.service;

import java.util.List;

import com.xworkz.cake.dto.CakeDTO;

public interface CakeService {
	
	public boolean save(CakeDTO dto);
	
	public CakeDTO findById(int id);
	
	public List<CakeDTO> readAll();
	
	public boolean updateByName(String name);
	
	public boolean DeleteById(int id);

}

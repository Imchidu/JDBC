package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.BikeDto;

public interface BikeService {

	public boolean save(BikeDto dto);
	
	public List<BikeDto> read();
	
	public BikeDto findByBrand(String brand);
	
	public BikeDto findByBrandAndPrice(String brand,int price );
	
	public BikeDto updateBrandByIndex(String brand,int index);
	
	public boolean updateBrandByPrice(String brand,int price); 
	
	
}
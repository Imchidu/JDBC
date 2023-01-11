package com.xworkz.soap.repo;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;

public interface SoapRepo {
	
	public boolean save(SoapDto dto);
	
	public List<SoapDto> read();
	
	public SoapDto findByNameAndPrice(String name,int price);
	
	public SoapDto updateNameByPrice(String name,int price);
	
	public SoapDto updateColourAndFragranceByName(String colour,String fragrance,String name);
	
	public SoapDto updateTypeById(String type,int id);
	

}

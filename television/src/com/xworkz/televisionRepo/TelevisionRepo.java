package com.xworkz.televisionRepo;

import java.util.List;

import com.xworkz.televisionDto.TelevisionDto;

public interface TelevisionRepo {

	public boolean save(TelevisionDto dto);
	
	public List<TelevisionDto> read();

	public TelevisionDto findByBrandnameAndSize(String name,String size);
	
	
}

package com.xworkz.televisionService;

import java.util.List;

import com.xworkz.televisionDto.TelevisionDto;

public interface TelevisionService {
	
	public boolean save(TelevisionDto dto);
	
	public List <TelevisionDto> read();
    
	public TelevisionDto findByBrandnameAndSize(String name,String size);



}

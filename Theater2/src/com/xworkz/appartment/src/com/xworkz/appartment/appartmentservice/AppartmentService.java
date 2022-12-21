package com.xworkz.appartment.appartmentservice;

import java.util.List;

import com.xworkz.appartment.appartmentdto.AppartmentDto;

public interface AppartmentService {
	
	public boolean validateAndSave(AppartmentDto Dto);
	 
	 public List<AppartmentDto> read();
	 
	 
	 public AppartmentDto findByName(String name);
	

}

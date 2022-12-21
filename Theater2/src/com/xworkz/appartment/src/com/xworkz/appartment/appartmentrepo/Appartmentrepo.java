package com.xworkz.appartment.appartmentrepo;

import java.util.List;

import com.xworkz.appartment.appartmentdto.AppartmentDto;

public interface Appartmentrepo {
	
	public boolean save(AppartmentDto Dto);
	
	public List<AppartmentDto> read();
	
	public AppartmentDto findByName(String name);
     
}

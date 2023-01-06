package com.xworkz.televisionRepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.televisionDto.TelevisionDto;

public class TelevisionRepoImpl implements TelevisionRepo {

	
	ArrayList<TelevisionDto> list=new ArrayList<TelevisionDto>();
	@Override
	public boolean save(TelevisionDto dto) {

		list.add(dto);
		
		return true;
	}
	
	@Override
	public List<TelevisionDto> read() {
		
		
		return list;
	}
	
	
	@Override
	public TelevisionDto findByBrandnameAndSize(String name, String size) {
		for(TelevisionDto dto : list) {
			
			if(dto.getBrandName().length()>=2 && equals(name)) {
			
				System.out.println("found data");
				return dto;
			}
			
			
		}
		
		return null;
	}
	
	


}

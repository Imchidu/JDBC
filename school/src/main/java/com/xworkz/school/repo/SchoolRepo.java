package com.xworkz.school.repo;

import java.util.List;

import com.xworkz.school.DTO.SchoolDTO;

public interface SchoolRepo {
	
	public String save(SchoolDTO dto);
	
	List<SchoolDTO>readAll();

}

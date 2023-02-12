package com.xworkz.school.service;

import java.util.List;

import com.xworkz.school.DTO.SchoolDTO;

public interface SchoolService {

	public String save(SchoolDTO dto);

	List<SchoolDTO> readAll();
}

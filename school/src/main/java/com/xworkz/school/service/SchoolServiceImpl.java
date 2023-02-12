package com.xworkz.school.service;

import java.util.List;

import com.xworkz.school.DTO.SchoolDTO;
import com.xworkz.school.repo.SchoolRepo;
import com.xworkz.school.repo.SchoolRepoImpl;

public class SchoolServiceImpl implements SchoolService {
	private SchoolRepo repo = new SchoolRepoImpl();

	@Override
	public String save(SchoolDTO dto) {
		if (dto.getName().length() >= 2) {
			repo.save(dto);

			return "data saved successfully";
		}

		return "data not saved";
	}

	@Override
	public List<SchoolDTO> readAll() {

		return repo.readAll();
	}

}

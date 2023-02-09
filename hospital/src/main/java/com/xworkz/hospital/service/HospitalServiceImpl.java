package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repo.HospitalRepo;
import com.xworkz.hospital.repo.HospitalRepoImpl;

public class HospitalServiceImpl implements HospitalService {

	private HospitalRepo repo = new HospitalRepoImpl();

	@Override
	public String validateAndsave(HospitalDTO dto) {
		
		System.out.println("Data saved Successfully");
		return repo.save(dto);
		
	}
}

package com.xworkz.hospital.repo;

import java.util.List;

import com.xworkz.hospital.dto.HospitalDTO;

public interface HospitalRepo {
	
	
	public String save(HospitalDTO dto);
	
	public List<HospitalDTO>readAll();

}

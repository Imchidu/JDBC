package com.xworkz.hospital.service;

import java.util.List;

import com.xworkz.hospital.dto.HospitalDTO;

public interface HospitalService {
	
	public String validateAndsave(HospitalDTO dto);
	
	public List<HospitalDTO>readAll();

}

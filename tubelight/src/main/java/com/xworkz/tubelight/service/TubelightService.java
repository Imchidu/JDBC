package com.xworkz.tubelight.service;

import java.util.List;

import com.xworkz.tubelight.dto.TubelightDTO;

public interface TubelightService {
	
	
	public boolean create(TubelightDTO dto);

	public List<TubelightDTO> readAll();

	public TubelightDTO findByName(String name);

}

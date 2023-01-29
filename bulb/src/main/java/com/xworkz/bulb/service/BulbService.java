package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDTO;

public interface BulbService {

	public boolean create(BulbDTO dto);

	public List<BulbDTO> readAll();

	public BulbDTO findBybrandName(String name);

}

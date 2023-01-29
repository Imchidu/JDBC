package com.xworkz.bulb.repo;

import java.util.List;

import com.xworkz.bulb.dto.BulbDTO;

public interface BulbRepo {

	public boolean create(BulbDTO dto);

	public List<BulbDTO> readAll();

	public BulbDTO findBybrandName(String name);

}

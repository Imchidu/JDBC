package com.xworkz.cake.repo;

import java.util.List;

import com.xworkz.cake.dto.CakeDTO;

public interface CakeRepo {

	public boolean save(CakeDTO dto);

	public CakeDTO findById(int id);

	public List<CakeDTO> readall();

	public boolean updateByName(String name);

	public boolean deleteById(int id);

}

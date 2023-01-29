package com.xworkz.chocolate.repo;

import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDTO;

public interface ChocolateRepo {

	public boolean save(ChocolateDTO dto);

	public ChocolateDTO findById(int id);

	public List<ChocolateDTO> readAll();

	public boolean updateNameById(String name, int id);

	public boolean deletePriceById(int price, int id);

}

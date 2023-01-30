package com.xworkz.spects.service;

import java.util.List;

import com.xworkz.spects.dto.SpectsDTO;

public interface SpectsService {

	public boolean create(SpectsDTO dto);

	public List<SpectsDTO> readAll();

	public SpectsDTO findByShapeAndPrice(String shape, int price);

	public boolean updatePriceByName(int price, String name);

	public boolean updateColorByPriceAndShape(String color, int price, String shape);

	public boolean deleteByPriceAndColor(int price, String color);

	public boolean deleteByNameAndId(String name, int id);
}

package com.xworkz.Chocolate1.service;

import java.util.List;

import com.xworkz.Chocolate1.dto.Chocolate1DTO;

public interface Chocolate1Service {

	public boolean createAll(Chocolate1DTO dto);

	public List<Chocolate1DTO> readAll();

	public Chocolate1DTO findByColorAndWeight(String color, String weight);

	public Chocolate1DTO findByPriceAndName(int price, String name);

	public boolean updateWeightByNameAndColor(String weight, String name, String color);

	public boolean updateNameByIdAndWeight(String name, int id, String weight);

	public boolean deleteByColorAndName(String color, String name);

}

package com.xworkz.carservice;

import java.util.List;

import com.xworkz.carDto.CarDto;

public interface CarService {
	
	
	public boolean save(CarDto dto);
	
	public List<CarDto> read();
	
	public CarDto findByBrand(String brand);
	
	public boolean updateColorByIndex(String color,int index);
	
	public boolean updateSpeedByIndex(int speed,int index);

	public boolean updateSpeedByBrand(int speed, String brand);
	
	public boolean updatePriceByType(int price,String type);
}

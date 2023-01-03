package com.xworkz.carrepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.carDto.CarDto;

public class CarRepoImpl implements CarRepo {

	List<CarDto> list = new ArrayList<CarDto>();

	@Override
	public boolean save(CarDto dto) {
		list.add(dto);
		return true;
	}

	@Override
	public List<CarDto> read() {

		return list;
	}

	@Override
	public CarDto findByBrand(String brand) {
		for (CarDto dto : list) {
			if (dto.getBrand().equals(brand)) {
				System.out.println("found brand");
				return dto;
			}
		}
		return null;

	}

	@Override
	public boolean updateColorByIndex(String color, int index) {
		CarDto carDto = list.get(index);
		carDto.setColour(color);
		list.set(index, carDto);
		return true;
	}

	@Override
	public boolean updateSpeedByIndex(int speed, int index) {
		CarDto carDto = list.get(index);
		carDto.setSpeed(speed);
		list.set(index, carDto);
		
		return true;
	}

	@Override
	public boolean updateSpeedByBrand(int speed, String brand) {
		for (int i = 0; i < list.size(); i++) {
			CarDto carDto = list.get(i);
			if (carDto.getBrand().equals(brand)) {
				carDto.setSpeed(speed);
				list.set(i, carDto);
			}

		}
		return true;
	}

	@Override
	public boolean updatePriceByType(int price, String type) {
		for (int i = 0; i < list.size(); i++) {

			CarDto carDto = list.get(i);
			if (carDto.getPrice() >= 0 && carDto.getType().equals(type)) {
				carDto.setPrice(price);
				list.set(i, carDto);
			}

		}

		return true;
		
		
	}

}

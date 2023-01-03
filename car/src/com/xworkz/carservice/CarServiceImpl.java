package com.xworkz.carservice;

import java.util.List;

import com.xworkz.carDto.CarDto;
import com.xworkz.carrepo.CarRepo;
import com.xworkz.carrepo.CarRepoImpl;

public class CarServiceImpl implements CarService {

	CarRepo repo = new CarRepoImpl();

	@Override
	public boolean save(CarDto dto) {

		if (dto != null) {

			if (dto.getBrand().length() >= 3) {
				System.out.println("data is valid & sending to repo");
				return repo.save(dto);
			} else {
				System.out.println("data is invalid");
			}

		}
		return false;
	}

	@Override
	public List<CarDto> read() {
		return repo.read();

	}

	@Override
	public CarDto findByBrand(String brand) {

		if (brand != null) {

			if (brand.length() > 3) {
				System.out.println("finding brand");
				return repo.findByBrand(brand);
			}

			else {
				System.out.println("brand not found");

			}

		}

		return null;
	}

	@Override
	public boolean updateColorByIndex(String color, int index) {
		if (color != null && color.length() >= 2 && color.equals(color) && index >= 0) {
			return repo.updateColorByIndex(color, index);
		}
		return false;
	}

	@Override
	public boolean updateSpeedByIndex(int speed, int index) {
		if (speed != 0 && index >= 0) {
			return repo.updateSpeedByIndex(speed, index);
		}
		return true;
	}

	@Override
	public boolean updateSpeedByBrand(int speed, String brand) {
		if (speed != 0 && brand.length() >= 2) {
			return repo.updateSpeedByBrand(speed, brand);

		}

		return true;
	}

	@Override
	public boolean updatePriceByType(int price, String type) {

		if(price != 0 && type.length()>=2) {
			
			return repo.updatePriceByType(price, type);
		}
		return true;
	}

}

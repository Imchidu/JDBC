package com.xworkz.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dto.BikeDto;

public class BikeRepoImpl implements BikeRepo {

	List<BikeDto> list = new ArrayList<BikeDto>();

	@Override
	public boolean save(BikeDto dto) {

		list.add(dto);

		return true;

	}

	@Override
	public List<BikeDto> read() {

		return list;
	}

	@Override
	public BikeDto findByBrand(String brand) {
		for (BikeDto dto : list) {
			if (dto.getBrand().equals(brand)) {

				System.out.println(" data saved");

				return dto;

			}

		}

		return null;
	}

	@Override
	public BikeDto findByBrandAndPrice(String brand, int price) {

		for (BikeDto dto : list) {
			if (dto.getBrand().equals(brand) && dto.getPrice() == price) {
				return dto;
			}

		}

		return null;

	}

	@Override
	public BikeDto updateBrandByIndex(String brand, int index) {
		BikeDto bikeDto = list.get(index);
		bikeDto.setBrand(brand);
		BikeDto set = list.set(index, bikeDto);
		return set;
	}
 
	@Override
	public boolean updateBrandByPrice(String brand, int price) {
		for (int i = 0; i < list.size(); i++) {
			BikeDto bikeDto = list.get(i);
			if (bikeDto.getPrice()!=0) {
				bikeDto.setBrand(brand);
				 BikeDto set = list.set(i, bikeDto);
				 System.out.println(set);
				return true;
			}
		}
		return false;
	}
}

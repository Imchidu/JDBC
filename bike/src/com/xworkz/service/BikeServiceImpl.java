package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.BikeDto;
import com.xworkz.repo.BikeRepo;
import com.xworkz.repo.BikeRepoImpl;

public class BikeServiceImpl implements BikeService {

	BikeRepo repo = new BikeRepoImpl();

	@Override
	public boolean save(BikeDto dto) {

		if (dto != null && dto.getBrand().length() > 2) {

			System.out.println("data is valid");

			return repo.save(dto);

		}

		return false;
	}

	@Override
	public List<BikeDto> read() {

		return repo.read();
	}

	@Override
	public BikeDto findByBrand(String brand) {
		if (brand != null && brand.length() >= 2) {

			System.out.println("data is valid");
			return repo.findByBrand(brand);
		}

		return null;
	}

	@Override
	public BikeDto findByBrandAndPrice(String brand, int price) {
		if (brand != null && price != 0) {
			System.out.println("finding data by passing brand and price ");
			return repo.findByBrandAndPrice(brand, price);
		} else {
			System.out.println("data not found by find by brand");
		}

		return null;
	}

	@Override
	public BikeDto updateBrandByIndex(String brand, int index) {
		if (brand != null && brand.length() >= 2) {
			System.out.println("updating  by brand");
			return repo.updateBrandByIndex(brand, index);

		}

		return null;
	}

	@Override
	public boolean updateBrandByPrice(String brand, int price) {
		if (brand != null && brand.length() >= 2 && price >= 0) {
			System.out.println("updating price by brand");
			return repo.updateBrandByPrice(brand, price);

		} else {
			System.out.println("invalid");
		}

		return false;
	}

}

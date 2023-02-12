package com.xworkz.drinks.repo;

import com.xworkz.drinks.dto.DrinksDto;
import com.xworkz.drinks.service.DrinksRepo;
import com.xworkz.drinks.service.DrinksRepoImpl;

public class DrinksServiceImpl implements DrinksService {

	DrinksRepo repo = new DrinksRepoImpl();

	@Override
	public boolean save(DrinksDto dto) {
		if (dto != null) {
			if (dto.getBrand().length() >= 2) {
				repo.save(dto);
			}
		}
		return false;
	}

}

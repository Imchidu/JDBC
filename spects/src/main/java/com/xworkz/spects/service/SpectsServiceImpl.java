package com.xworkz.spects.service;

import java.util.List;

import com.xworkz.spects.dto.SpectsDTO;
import com.xworkz.spects.repo.SpectsRepo;
import com.xworkz.spects.repo.SpectsRepoImpl;

public class SpectsServiceImpl implements SpectsService {
	SpectsRepo repo = new SpectsRepoImpl();

	public boolean create(SpectsDTO dto) {
		if (dto != null) {
			System.out.println("data valid and saved ");
			return repo.create(dto);
		}

		return false;
	}

	public List<SpectsDTO> readAll() {

		return repo.readAll();

	}

	public SpectsDTO findByShapeAndPrice(String shape, int price) {
		if (shape != null && price >= 500) {
			return repo.findByShapeAndPrice(shape, price);
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {

		if (price != 600 && name != null) {
			return repo.updatePriceByName(price, name);
		}
		return false;

	}

	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if (color != null && price >= 300 && shape != null) {
			return repo.updateColorByPriceAndShape(color, price, shape);
		}

		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if (price > 0 && color != null) {
			return repo.deleteByPriceAndColor(price, color);
		}
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if(name!=null && id>=0) {
			return repo.deleteByNameAndId(name, id);
		}
		return false;
	}

}

package com.xworkz.televisionService;

import java.util.List;

import com.xworkz.televisionDto.TelevisionDto;
import com.xworkz.televisionRepo.TelevisionRepo;
import com.xworkz.televisionRepo.TelevisionRepoImpl;

public class TelevisionServiceImpl implements TelevisionService {

	TelevisionRepo repo = new TelevisionRepoImpl();

	@Override
	public boolean save(TelevisionDto dto) {
		if (dto != null && dto.getBrandName().length() >= 2 && dto.getPrice() > 0) {

			System.out.println("data is valid");
			return repo.save(dto);
		}

		return false;
	}

	@Override
	public List<TelevisionDto> read() {

		return repo.read();
	}

	@Override
	public TelevisionDto findByBrandnameAndSize(String name, String size) {

		if (name != null && size.length() >= 1) {
			System.out.println("finding data");

			return repo.findByBrandnameAndSize(name, size);

		}

		return null;
	}

	

}

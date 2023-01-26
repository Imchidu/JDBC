
package com.xworkz.cake.service;

import java.util.List;

import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.repo.CakeRepo;
import com.xworkz.cake.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService {

	CakeRepo repo = new CakeRepoImpl();

	public boolean save(CakeDTO dto) {
		if (dto != null) {
			repo.save(dto);
			System.out.println("data saved");
		}
		return false;
	}

	public CakeDTO findById(int id) {
		if (id >= 0) {
			System.out.println("data found");
			return repo.findById(id);

		}

		return null;
	}

	public List<CakeDTO> readAll() {

		return null;
	}

	public boolean updateByName(String name) {
		if (name.length() >= 2) {
			System.out.println("data updated");
			return repo.updateByName(name);
		}

		return false;
	}

	public boolean DeleteById(int id) {
		if (id >= 0) {
			System.out.println("data is deleted");
			return repo.deleteById(id);
		}

		return false;
	}

}

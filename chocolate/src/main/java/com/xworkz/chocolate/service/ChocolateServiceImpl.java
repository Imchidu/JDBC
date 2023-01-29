package com.xworkz.chocolate.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.repo.ChocolateRepo;
import com.xworkz.chocolate.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {
	ChocolateRepo Repo = new ChocolateRepoImpl();

	public boolean save(ChocolateDTO dto) {
		if (dto != null) {
			System.out.println("data saved");
			return Repo.save(dto);
		}
		return true;
	}

	public ChocolateDTO findById(int id) {
		if (id != 0) {
			System.out.println("found data");
			return Repo.findById(id);
		}
		return null;
	}

	public List<ChocolateDTO> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateNameById(String name, int id) {
		if (name != null && id > 0) {
			System.out.println("data updated");
			return Repo.updateNameById(name, id);
		}

		return false;
	}

	public boolean deletePriceById(int price, int id) {
		if(price>0 && id>0) {
			System.out.println("data delated");
			return Repo.deletePriceById(price, id);
		}
		
		return false;
	}

}

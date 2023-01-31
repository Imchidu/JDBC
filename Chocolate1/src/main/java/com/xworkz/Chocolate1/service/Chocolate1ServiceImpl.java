package com.xworkz.Chocolate1.service;

import java.util.List;

import com.xworkz.Chocolate1.dto.Chocolate1DTO;
import com.xworkz.Chocolate1.repo.Chocolate1Repo;
import com.xworkz.Chocolate1.repo.Chocolate1RepoImpl;

public class Chocolate1ServiceImpl implements Chocolate1Service {

	Chocolate1Repo repo = new Chocolate1RepoImpl();

	public boolean createAll(Chocolate1DTO dto) {
		if (dto != null) {

			return repo.createAll(dto);
		}
		return false;
	}

	public List<Chocolate1DTO> readAll() {

		return repo.readAll();
	}

	public Chocolate1DTO findByColorAndWeight(String color, String weight) {
		if (color != null && weight != null) {

			return repo.findByColorAndWeight(color, weight);
		}
		return null;
	}

	public Chocolate1DTO findByPriceAndName(int price, String name) {
		if (price >=0 && name != null) {

			return repo.findByPriceAndName(price, name);
		}
		
		return null;
	}

	public boolean updateWeightByNameAndColor(String weight, String name, String color) {
if(weight!=null && name!= null &&color!=null) {
	
	return repo.updateWeightByNameAndColor(weight, name, color);
	
}
		
		return false;
	}

	public boolean deleteByColorAndName(String color, String name) {
if(color!=null && name!=null){
	return repo.deleteByColorAndName(color, name);
	
}
		
		
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, String weight) {
		
		if(name!=null && id>=0 &&weight!=null) {
			
			return repo.updateNameByIdAndWeight(name, id, weight);
		}
		return false;
	}

}

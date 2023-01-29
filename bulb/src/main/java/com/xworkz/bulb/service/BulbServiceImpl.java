package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDTO;
import com.xworkz.bulb.repo.BulbRepo;
import com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {

BulbRepo Repo=new BulbRepoImpl();
	
	public boolean create(BulbDTO dto) {
if(dto!=null) {
	if(dto.getBrandName().length()>=1 && dto.getId()>0) {
		System.out.println("data saved");
		Repo.create(dto);
	}
}
		return false;
	}

	public List<BulbDTO> readAll() {

		
		return Repo.readAll();
	}

	public BulbDTO findBybrandName(String name) {
		if(name!=null && name.length()>=0) {
		return	Repo.findBybrandName(name);
		}
		
		return null;
		
	}

	

}

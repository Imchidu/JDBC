package com.xworkz.tubelight.service;

import java.util.List;

import com.xworkz.tubelight.dto.TubelightDTO;
import com.xworkz.tubelight.repo.TubelightRepo;
import com.xworkz.tubelight.repo.TubelightRepoImpl;

public class TubelightServiceImpl implements TubelightService {
TubelightRepo repo=new TubelightRepoImpl();

	public boolean create(TubelightDTO dto) {
if(dto!=null) {
	if(dto.getId()>=0 && dto.getPrice()>0) {
		System.out.println("data saved");
		return repo.create(dto);
		
	}
}
		return false;
	}

	public List<TubelightDTO> readAll() {
		return repo.readAll();
	}

	public TubelightDTO findByName(String name) {
if(name!=null && name.length()>=0) {
	System.out.println("data found");
	return repo.findByName(name);
}
return null;
		
		
	}

}

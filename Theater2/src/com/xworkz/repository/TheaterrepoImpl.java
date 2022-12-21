package com.xworkz.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dto.Theaterdto;

public class TheaterrepoImpl implements Theaterrepo {

	List<Theaterdto> list= new ArrayList<Theaterdto>();
 
	@Override
	public boolean save(Theaterdto dto) {
     list.add(dto);
     System.out.println("data="+dto);
		return true;
	}

	@Override
	public List<Theaterdto> read() {
		
		return list;
	}

	@Override
	public Theaterdto findByName(String name) {
		for (Theaterdto theaterdto : list) {
			if(theaterdto.getName().equals(name)) {
				System.out.println("Data saving to Database");
				return theaterdto;
			}
		}
		return null;
	}

	

}

package com.xworkz.repository;

import java.util.List;

import com.xworkz.dto.Theaterdto;

public interface Theaterrepo {
	
	public boolean save(Theaterdto dto);
	
	public List<Theaterdto> read();
	
	public Theaterdto findByName(String name);

}

package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.Theaterdto;

public interface Theaterservice {
	
	public boolean validateAndSave(Theaterdto dto);
   
	public List<Theaterdto>read();
	
	public Theaterdto findByName(String name);
}

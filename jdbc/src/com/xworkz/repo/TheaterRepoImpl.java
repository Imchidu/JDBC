package com.xworkz.repo;

import com.xworkz.dto.TheaterDTO;

public class TheaterRepoImpl implements TheaterRepo {

	@Override
	public boolean save(TheaterDTO dto) {
		System.out.println("All Data is Saved");
		return true;
	}

}

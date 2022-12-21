package com.xworkz.service;

import com.xworkz.dto.TheaterDTO;
import com.xworkz.repo.TheaterRepo;

public class TheaterServiceImpl implements TheaterService {
	
	private TheaterRepo repo;`

	public TheaterServiceImpl() {
		System.out.println("Default Constructor Created In TheaterServiceImpl");
	}

	@Override
	public boolean validAndSave(TheaterDTO dto) {
		String location = dto.getLocation();
		boolean parking = dto.isParking();
		int floors = dto.getFloors();
		if (location != null && location.length() >= 3) {
			System.out.println("Location  is Valid");
			if (floors != 0 && floors >= 1) {
				System.out.println("Floors are Valid");
				this.repo.save(dto);
				System.out.println(dto);
			} else {
				System.out.println("Floor is Invalid");
			}
		} else {
			System.out.println("invalid  Location");
		}
		return true;

	}
}

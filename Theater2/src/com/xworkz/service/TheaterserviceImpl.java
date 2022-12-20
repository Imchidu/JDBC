package com.xworkz.service;

import com.xworkz.dto.Theaterdto;
import com.xworkz.repository.Theaterrepo;
import com.xworkz.repository.TheaterrepoImpl;

public class TheaterserviceImpl implements Theaterservice {

	public TheaterserviceImpl() {
		System.out.println("created TheaterserviceImpl  ");
	}

	@Override
	public boolean validateAndSave(Theaterdto dto) {

		Theaterrepo impl = new TheaterrepoImpl();

		if (dto != null) {
			System.out.println("valid");
			if (dto.getName().length() >= 3) {
				System.out.println("tranfering to repo");
				impl.save(dto);
			} else {
				System.out.println("not valid");
			}

		}

		return false;
	}

}

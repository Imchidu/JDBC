package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.Theaterdto;
import com.xworkz.repository.Theaterrepo;
import com.xworkz.repository.TheaterrepoImpl;

public class TheaterserviceImpl implements Theaterservice {

	public TheaterserviceImpl() {
		System.out.println("created TheaterserviceImpl  ");
	}

	Theaterrepo impl = new TheaterrepoImpl();

	@Override
	public boolean validateAndSave(Theaterdto dto) {

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

	@Override
	public List<Theaterdto> read() {

		return impl.read();
	}

	@Override
	public Theaterdto findByName(String name) {
		System.out.println("Running findbyname");
   if(name!=null) {
	   if(name.length()>=3) {
		   System.out.println("Data is Valid");
		   return impl.findByName(name);
	   }
	   else {
		   System.out.println("Data not Valid");
	   }
   }
		return null;

	}

}

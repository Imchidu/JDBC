package com.xworkz.appartment.appartmentservice;

import java.util.List;

import com.xworkz.appartment.appartmentdto.AppartmentDto;
import com.xworkz.appartment.appartmentrepo.AppartmentrepoImpl;

public class AppartmentServiceImpl implements AppartmentService {

	AppartmentrepoImpl repo = new AppartmentrepoImpl();

	@Override
	public boolean validateAndSave(AppartmentDto Dto) {

		if (Dto != null) {

			System.out.println(" Data is valid");
			if (Dto.getLocation().length() >= 2) {

				System.out.println("Sending to repository");
				repo.save(Dto);
			} else {
				System.out.println("not valid");
			}
		}

		return true;

	}

	@Override
	public List<AppartmentDto> read() {

		return repo.read();

	}

	@Override
	public AppartmentDto findByName(String name) {
		System.out.println("Running FindByName method");
		if (name != null && name.length() >= 3) {

			return this.repo.findByName(name);
		} else {

			System.out.println("Name is Invalid OR null");
		}
		return null;

	}

}

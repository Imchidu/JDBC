package com.xworkz.appartment.appartmentrepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.appartment.appartmentdto.AppartmentDto;

public class AppartmentrepoImpl implements Appartmentrepo {

	List<AppartmentDto> list = new ArrayList<AppartmentDto>();

	@Override
	public boolean save(AppartmentDto Dto) {

		list.add(Dto);
		System.out.println("Details of Appartment=" + Dto);

		return false;
	}

	@Override
	public List<AppartmentDto> read() {

		return list;
	}

	@Override
	public AppartmentDto findByName(String name) {
		System.out.println("find by name.......repoimpl");
		for (AppartmentDto appartmentDto : list) {
			if (appartmentDto.getName().equals(name)) {

				return appartmentDto;
			}

		}
		return null;
	}

}

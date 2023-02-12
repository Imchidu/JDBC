package com.xworkz.test.service;

import java.util.List;

import com.xworkz.test.dto.TestDto;
import com.xworkz.test.repo.TestRepo;
import com.xworkz.test.repo.TestRepoImpl;

public class TestServiceImpl implements TestService {
TestRepo repo= new TestRepoImpl();
	@Override
	public String save(TestDto dto) {
		if(dto.getName().length()>=0) {
			
			return repo.save(dto);
		}
		
		
		return null;
	}
	@Override
	public List<TestDto> readAll() {

		
		return repo.readAll();
	}

}

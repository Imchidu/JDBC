package com.xworkz.test.service;

import java.util.List;

import com.xworkz.test.dto.TestDto;

public interface TestService {
	public String save(TestDto dto);

	List<TestDto> readAll();
}

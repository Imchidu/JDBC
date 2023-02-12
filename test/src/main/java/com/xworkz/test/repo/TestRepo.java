package com.xworkz.test.repo;

import java.util.List;

import com.xworkz.test.dto.TestDto;

public interface TestRepo {

	public String save(TestDto dto);

	List<TestDto> readAll();
}

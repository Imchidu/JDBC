package com.xworkz.main;

import com.xworkz.dto.TheaterDTO;
import com.xworkz.service.TheaterService;
import com.xworkz.service.TheaterServiceImpl;

public class runner {

	public static void main(String[] args) {
		TheaterDTO dto = new TheaterDTO("bengaluru", 2, "chidu", "Avatar", true);

		TheaterService service = new TheaterServiceImpl();
		service.validAndSave(dto);


	}
}

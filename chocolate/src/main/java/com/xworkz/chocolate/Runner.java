package com.xworkz.chocolate;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.service.ChocolateService;
import com.xworkz.chocolate.service.ChocolateServiceImpl;

public class Runner {

	public static void main(String[] args) {

		ChocolateService Service = new ChocolateServiceImpl();

		ChocolateDTO dto1 = new ChocolateDTO(1, "Dairy milk", 30);
		ChocolateDTO dto2 = new ChocolateDTO(2, " Kitkat", 20);
		ChocolateDTO dto3 = new ChocolateDTO(3, "5Star", 10);
		ChocolateDTO dto4 = new ChocolateDTO(4, "Milkybar", 15);
		ChocolateDTO dto5 = new ChocolateDTO(5, "Munch", 5);

//		Service.save(dto1);
//		Service.save(dto2);
//		Service.save(dto3);
//		Service.save(dto4);
//		Service.save(dto5);

		ChocolateDTO findById = Service.findById(1);
		System.out.println(findById);

		System.out.println(Service.updateNameById("crunch", 3));

		boolean deletePriceById = Service.deletePriceById(5, 4);

		System.out.println(deletePriceById);
	}

}

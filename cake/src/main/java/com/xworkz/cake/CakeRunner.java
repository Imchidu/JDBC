package com.xworkz.cake;

import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.service.CakeService;
import com.xworkz.cake.service.CakeServiceImpl;

public class CakeRunner {

	public static void main(String[] args) {

		CakeDTO dto = new CakeDTO(1, "Honneycake", 20, "honey", "Square");
		CakeDTO dto1 = new CakeDTO(2, "ChocoCake", 25, "choco", "Rectangle");
		CakeDTO dto2 = new CakeDTO(3, "Vannilacake", 30, "vannila", "square");
		CakeDTO dto3 = new CakeDTO(4, "Plumcake", 100, "Fruits", "Round");
		CakeDTO dto4 = new CakeDTO(5, "Lavacake", 30, "choco", "Round");

		CakeService service = new CakeServiceImpl();
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
		
		
		
//		service.save(dto4);

		CakeDTO findById = service.findById(1);
		System.out.println(findById);

		boolean updateByName = service.updateByName("Bannanacake");
		System.out.println(updateByName);

		boolean deleteById = service.DeleteById(3);
		System.out.println(deleteById);
	}

}

package com.xworkz.bulb;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bulb.dto.BulbDTO;
import com.xworkz.bulb.service.BulbService;
import com.xworkz.bulb.service.BulbServiceImpl;

public class BulbTester {

	public static void main(String[] args) {
		BulbService service = new BulbServiceImpl();

		BulbDTO dto1 = new BulbDTO(1, "philips", 18, "medium", "white");
		BulbDTO dto2 = new BulbDTO(2, "syska", 20, "medium", "white");
		BulbDTO dto3 = new BulbDTO(3, "havells", 18, "medium", "white");
		BulbDTO dto4 = new BulbDTO(4, "LG", 18, "medium", "white");
		BulbDTO dto5 = new BulbDTO(5, "havells", 18, "medium", "white");
		BulbDTO dto6 = new BulbDTO(6, "syska", 18, "medium", "white");
		BulbDTO dto7 = new BulbDTO(7, "GM", 18, "medium", "white");
		BulbDTO dto8 = new BulbDTO(8, "panasonic", 18, "medium", "white");
		BulbDTO dto9 = new BulbDTO(9, "halonix", 18, "medium", "white");
		BulbDTO dto10 = new BulbDTO(10, "wipro", 18, "medium", "white");

//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
//		service.create(dto6);
//		service.create(dto7);
//		service.create(dto8);
//		service.create(dto9);
//		service.create(dto10);

		List<BulbDTO> readAll = service.readAll();

	for (BulbDTO string : service.readAll()) {
		System.out.println(string);
	}
// 
//		List<BulbDTO> list = (List<BulbDTO>) service.findBybrandName("havells");
//		 for (BulbDTO bulbDTO : list) {
//			System.out.println(bulbDTO);
//		}

	System.out.println(service.findBybrandName("GM"));

	}

}

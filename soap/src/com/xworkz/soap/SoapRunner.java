package com.xworkz.soap;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.repo.SoapRepo;
import com.xworkz.soap.repo.SoapRepoImpl;

public class SoapRunner {

	public static void main(String[] args) {

		SoapDto dto = new SoapDto(3, "detol", 40, "green", "pleasant", 120, 2022, " medicated");
		SoapDto dto1 = new SoapDto(4, "santoor", 35, "orange", "pleasant", 100, 2022, " beauty");
		SoapDto dto2 = new SoapDto(5, "humamm", 30, "green", "pleasant", 110, 2022, " beauty");
		SoapDto dto3 = new SoapDto(6, "medimix", 40, "green", "pleasant", 120, 2022, " medicated");
		SoapDto dto4 = new SoapDto(7, "mysore sandall", 45, "light orange", "pleasant", 120, 2022, " medicated");
		SoapDto dto5 = new SoapDto(8, "cinthol", 40, "blue", "pleasant", 150, 2022, " medicated");
		SoapDto dto6 = new SoapDto(9, "park avenue", 70, "green", "pleasant", 120, 2022, " medicated");
		SoapDto dto7 = new SoapDto(10, "lux", 40, "white", "pleasant", 100, 2022, " beauty");

		SoapRepo repo = new SoapRepoImpl();

//		boolean save = repo.save(dto);
//		boolean save1 = repo.save(dto1);
//		boolean save2 = repo.save(dto2);
//		boolean save3 = repo.save(dto3);
//		boolean save4 = repo.save(dto4);
//		boolean save5 = repo.save(dto5);
//		boolean save6 = repo.save(dto6);
//		boolean save7 = repo.save(dto7);

//		System.out.println(save);
//		System.out.println(save1);

		System.out.println("---------------------read()----------------------");

		repo.read();
		
		System.out.println("-------------------findByNameAndPrice------------------------");

		SoapDto nameAndPrice = repo.findByNameAndPrice("lux", 40);
		System.out.println(nameAndPrice);
		
		System.out.println("------------------updateNameByPrice-------------------------");
		SoapDto nameByPrice = repo.updateNameByPrice("dove", 30);
		System.out.println(nameAndPrice);
		System.out.println(repo.read());
		
		System.out.println("------------------updateColourAndFragranceByName-------------------------");
		SoapDto byName = repo.updateColourAndFragranceByName("pink", "jasmine","lux");
		System.out.println(byName);
		System.out.println(repo.read());
		
		System.out.println("------------------updateTypeById-------------------------");
		SoapDto byId = repo.updateTypeById("skincare", 4);
		System.out.println(byId);
		System.out.println(repo.read());

	}

}

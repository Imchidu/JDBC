package com.xworkz;

import java.util.List;

import com.xworkz.dto.BikeDto;
import com.xworkz.service.BikeService;
import com.xworkz.service.BikeServiceImpl;

public class Runner {

	public static void main(String[] args) {

		BikeDto dto = new BikeDto("hero", "red", 60000, 100, 4);
		BikeDto dto1 = new BikeDto("honda", "black", 55000, 120, 3);
		BikeDto dto2= new BikeDto("tvs", "white", 50000, 150, 5);

		
		BikeService Impl = new BikeServiceImpl();

		
		Impl.save(dto);
		Impl.save(dto1);
		Impl.save(dto2);
		
		List list = Impl.read();
		System.out.println(list);

		
		BikeDto findByBrand = Impl.findByBrand("honda");
		System.out.println(findByBrand);
		System.out.println("=============================================");
		
		BikeDto findByBrandAndPrice = Impl.findByBrandAndPrice("tvs", 50000);
		System.out.println(findByBrandAndPrice);
		
		System.out.println("*************************************************");
		
		BikeDto byIndex = Impl.updateBrandByIndex("NS", 2);
		System.out.println(byIndex);
		
		boolean updateBrandByPrice = Impl.updateBrandByPrice("ktm", 50000);
		System.out.println(updateBrandByPrice);
	}

}

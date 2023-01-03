package com.xworkz.car;

import java.util.List;

import com.xworkz.carDto.CarDto;
import com.xworkz.carservice.CarService;
import com.xworkz.carservice.CarServiceImpl;

public class CarRunner {

	public static void main(String[] args) {

		CarDto dto = new CarDto("BMW", 1, "BLUE", "sports", 260);
		CarDto dto1 = new CarDto("jaguar", 2, "silver", "luxury", 240);
		CarDto dto2 = new CarDto("rollceroyce", 3, "grey", "luxury", 220);
		CarDto dto3 = new CarDto("landrover", 3, "white", "luxury", 260);
		CarDto dto4 = new CarDto("lamborgini", 2, "yellow", "sports", 300);

		

		CarService service = new CarServiceImpl();

		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		System.out.println("===============================");

		List list = service.read();
		System.out.println(list);
		System.out.println("===============================");

		CarDto findByBrand = service.findByBrand("jaguar");
		System.out.println(findByBrand);
		
		boolean update = service.updateColorByIndex("Black", 1);
		System.out.println(update);
		
		System.out.println(service.read());
		
		System.out.println("------------------------------------");
		
		boolean updateSpeedByIndex = service.updateSpeedByIndex(180,1);
		System.out.println(updateSpeedByIndex);
		System.out.println(service.read());
		
		System.out.println("--------------------------------------");
		
		boolean byBrand = service.updateSpeedByBrand(280,"BMW");
		System.out.println(byBrand);
		System.out.println(service.read());
		
		boolean updatePriceByType = service.updatePriceByType(5, "luxury");
		System.out.println(updatePriceByType);
		System.out.println(service.read());

	}

}

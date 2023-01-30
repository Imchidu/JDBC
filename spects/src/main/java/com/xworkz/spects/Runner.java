package com.xworkz.spects;

import java.util.List;

import com.google.protobuf.Service;
import com.xworkz.spects.dto.SpectsDTO;
import com.xworkz.spects.service.SpectsService;
import com.xworkz.spects.service.SpectsServiceImpl;

public class Runner {
	public static void main(String[] args) {

		SpectsService service = new SpectsServiceImpl();

		SpectsDTO dto = new SpectsDTO(1, "Reybon", "black", "round", 2000);
		SpectsDTO dto1 = new SpectsDTO(2, "Omega", "white", "rectangular", 1500);
		SpectsDTO dto2 = new SpectsDTO(3, "Fastrack", "white", "semiround", 2500);
		SpectsDTO dto3 = new SpectsDTO(4, "prada", "white", "square", 1200);

		service.create(dto);
		service.create(dto1);
		service.create(dto2);
		service.create(dto3);

		List<SpectsDTO> readAll1 = service.readAll();
		System.out.println(readAll1);

		SpectsDTO findByShapeAndPrice = service.findByShapeAndPrice("round", 2000);
		System.out.println(findByShapeAndPrice);

		boolean updatePriceByName = service.updatePriceByName(3000, "Reybon");
		System.out.println(updatePriceByName);

		boolean updateColorByPriceAndShape = service.updateColorByPriceAndShape("blue", 1500, "rectangular");
		System.out.println(updateColorByPriceAndShape);

		System.out.println(service.deleteByPriceAndColor(1200, "white"));

		System.out.println(service.deleteByNameAndId("omega", 2));

	}
}

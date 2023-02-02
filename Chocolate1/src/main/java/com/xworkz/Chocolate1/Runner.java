package com.xworkz.Chocolate1;

import java.util.List;

import com.xworkz.Chocolate1.dto.Chocolate1DTO;
import com.xworkz.Chocolate1.service.Chocolate1Service;
import com.xworkz.Chocolate1.service.Chocolate1ServiceImpl;

public class Runner {

	public static void main(String[] args) {
		Chocolate1Service service = new Chocolate1ServiceImpl();

		Chocolate1DTO dto = new Chocolate1DTO(1, "Dairymilk", "black", "20gms", 10);
		Chocolate1DTO dto1 = new Chocolate1DTO(2, "5Star", "brown", "30gms", 15);
		Chocolate1DTO dto2 = new Chocolate1DTO(3, "milkybar", "white", "35gms", 20);
		Chocolate1DTO dto3 = new Chocolate1DTO(4, "kitkat", "brown", "25gms", 25);
		Chocolate1DTO dto4 = new Chocolate1DTO(5, "munch", "black", "20gms", 5);

//		service.createAll(dto);
//		service.createAll(dto1);
//		service.createAll(dto2);
//		service.createAll(dto3);
//		service.createAll(dto4);

//		List<Chocolate1DTO> readAll = service.readAll();
//		System.out.println(readAll);
		
//		Chocolate1DTO findByColorAndWeight = service.findByColorAndWeight("white", "35gms");
//		System.out.println(findByColorAndWeight);
		
		
//		Chocolate1DTO findByPriceAndName = service.findByPriceAndName(20, "milkybar");
//		System.out.println(findByPriceAndName);
//		
		
//		boolean updateWeightByNameAndColor = service.updateWeightByNameAndColor("40gms", "munch", "black");
//		System.out.println(updateWeightByNameAndColor);
		
//		boolean updateNameByIdAndWeight = service.updateNameByIdAndWeight("cadburyyy", 1, "20gms");
//		System.out.println(updateNameByIdAndWeight);
		
//		
		boolean deleteByColorAndName = service.deleteByColorAndName("black", "munch");
		System.out.println(deleteByColorAndName);
//		
	}
	

}

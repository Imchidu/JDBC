package com.xworkz.appartment.main;

import java.util.List;

import com.xworkz.appartment.appartmentdto.AppartmentDto;
import com.xworkz.appartment.appartmentservice.AppartmentServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		AppartmentDto appartment=new AppartmentDto("ANGEL TOWER","BENGALURU",10,true);
		
		AppartmentDto	appartment1 =new AppartmentDto();
		
		appartment1.setName("SHANTINIVAS");
	    appartment1.setLocation("BEANGALURU");
	    appartment1.setNooffloors(15);
	    appartment1.setParking(false);
	    
		AppartmentServiceImpl service=new AppartmentServiceImpl();
		
		service.validateAndSave(appartment);
		service.validateAndSave(appartment1);

		List<AppartmentDto> read = service.read();
		for(AppartmentDto dto : read)
		System.out.println(dto);
		
		AppartmentDto findByName = service.findByName("ANGEL TOWER");
		System.out.println(findByName );
}
}

package com.xworkz.television;

import java.util.List;

import com.xworkz.televisionDto.TelevisionDto;
import com.xworkz.televisionService.TelevisionService;
import com.xworkz.televisionService.TelevisionServiceImpl;

public class TelevisionRunner {

	public static void main(String[] args) {

		TelevisionService Service = new TelevisionServiceImpl();

		TelevisionDto Dto = new TelevisionDto("LG", 456, "small", "LED", 12000 );
		TelevisionDto Dto1 = new TelevisionDto("TOSHIBA", 852, "medium", "LCD", 10000);
		
		
		Service.save(Dto);
		
		List<TelevisionDto> read = Service.read();
		
           System.out.println(read);
           
           
           TelevisionDto findByBrandnameAndSize = Service.findByBrandnameAndSize("LG", "small");
           
           System.out.println(findByBrandnameAndSize);
	}

}

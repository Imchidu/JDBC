package com.xworkz.tubelight;

import java.util.List;

import com.xworkz.tubelight.dto.TubelightDTO;
import com.xworkz.tubelight.service.TubelightService;
import com.xworkz.tubelight.service.TubelightServiceImpl;

public class Tester {

	public static void main(String[] args) {

		TubelightService service= new TubelightServiceImpl();
			
			
		
		TubelightDTO dto=new TubelightDTO(1,"philips",100);
		TubelightDTO dto1=new TubelightDTO(2,"havells",150);
		TubelightDTO dto2=new TubelightDTO(3,"syska",90);
		TubelightDTO dto3=new TubelightDTO(4,"GM",110);
		
		//service.create(dto);
		//service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
		
//		List<TubelightDTO> readAll1 = service.readAll();
//		
//		System.out.println(readAll1);
 
		TubelightDTO findByName1 = service.findByName("havells");
		System.out.println(findByName1);

	}

}

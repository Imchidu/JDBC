package com.xworkz.watch;



import com.google.protobuf.Service;
import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepoImpl;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
	
	
	
	WatchDto dto1= new WatchDto(2, "Titan", "golden", "analog", 1500);
	WatchDto dto2= new WatchDto(3, "hmt", "silver", "analog", 2500);
	WatchDto dto3= new WatchDto(4, "Tata", "silver", "digital", 2000);
	WatchDto dto4= new WatchDto(5, "Boat", "green", "smart", 3000);
	
	WatchService service=new WatchServiceImpl();
	
	WatchDto[] list= {dto1,dto2,dto3,dto4};
	
	for (int i = 0; i < list.length; i++) {
		service.saveAll(list[i]);
	}

	}
}

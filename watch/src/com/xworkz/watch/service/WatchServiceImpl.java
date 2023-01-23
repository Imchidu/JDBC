package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;
import com.xworkz.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {

	WatchRepo repo =new WatchRepoImpl();
	@Override
	public boolean saveAll(WatchDto dto) {
     if(dto!=null) {
    	 
    	 if(dto.getId()>0 && dto.getBrandName().length()>2) {
    		
    		 System.out.println("data is valid");
    		 repo.saveAll(dto);
    	 }
    	 else {
    		 System.out.println("data is invalid");
    	 }
    	 
    	 
     }
		
		
		return false;
	}

}

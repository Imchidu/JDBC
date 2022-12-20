package com.xworkz.main;

import com.xworkz.dto.Theaterdto;
import com.xworkz.service.Theaterservice;
import com.xworkz.service.TheaterserviceImpl;

public class Runner {

	public static void main(String[] args) {
  Theaterdto theater=new Theaterdto("inox","avatar",2,5,"malleshwaram",300,true,true,250.0,500.0,false,true);
 
 Theaterservice  theaterservice=new TheaterserviceImpl();
 theaterservice.validateAndSave(theater);
 
  
  
  
 
	}
}

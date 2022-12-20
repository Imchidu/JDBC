package com.xworkz.main;

import com.xworkz.dto.Theaterdto;
import com.xworkz.service.Theaterservice;
import com.xworkz.service.TheaterserviceImpl;

public class Runner {

	public static void main(String[] args) {
  Theaterdto theater=new Theaterdto("inox","avatar",2,5,"malleshwaram",300,true,true,250.0,500.0,false,true);
  Theaterdto theater1=new Theaterdto("pvr","vrl",2,5,"btm",350,true,true,250.0,500.0,false,true);
  Theaterdto theater2=new Theaterdto("cinipolis","vrl",2,5,"jayanagr",400,true,true,250.0,500.0,false,true);
  Theaterdto theater3=new Theaterdto("nartaki","avatar",2,5,"jpnagar",300,true,true,250.0,500.0,false,true);
  Theaterdto theater4=new Theaterdto("balaji","kantara",2,5,"malleshwaram",200,true,true,250.0,500.0,false,true);
  Theaterdto theater5=new Theaterdto("navarang","kantara",2,5,"rrnagar",300,true,true,250.0,500.0,false,true);
  Theaterdto theater6=new Theaterdto("mahalaxmi","avatar",2,5,"malleshwaram",400,true,true,250.0,500.0,false,true);
  Theaterdto theater7=new Theaterdto("laxmi","vrl",2,5,"btm",300,true,true,250.0,500.0,false,true);
  Theaterdto theater8=new Theaterdto("krishna","vrl",2,5,"rajajinagar",300,true,true,250.0,500.0,false,true);
  Theaterdto theater9=new Theaterdto("chandana","kantar",2,5,"malleshwaram",300,true,true,250.0,500.0,false,true);
  Theaterdto theater10=new Theaterdto("urvashi","kantar",2,5,"jpnagar",300,true,true,250.0,500.0,false,true);
  Theaterdto theater11=new Theaterdto("santosh","vrl",2,5,"malleshwaram",300,true,true,250.0,500.0,false,true);
  Theaterdto theater12=new Theaterdto("apsara","avatar",2,5,"majestic",300,true,true,250.0,500.0,false,true);
  Theaterdto theater13=new Theaterdto("ravi","ps1",2,5,"malleshwaram",300,true,true,250.0,500.0,false,true);
  Theaterdto theater14=new Theaterdto("chotu maharaj","ps1",2,5,"malleshwaram",300,true,true,250.0,500.0,false,true);
  Theaterdto theater15=new Theaterdto("rajkumar","avatar",2,5,"bommanalli",300,true,true,250.0,500.0,false,true);

 Theaterservice  theaterservice=new TheaterserviceImpl();
 theaterservice.validateAndSave(theater);
 
 theaterservice.validateAndSave(theater1);
 
 theaterservice.validateAndSave(theater2);
 
 theaterservice.validateAndSave(theater3);
 
 theaterservice.validateAndSave(theater4);
 
 theaterservice.validateAndSave(theater5);
 
 theaterservice.validateAndSave(theater6);
 
 theaterservice.validateAndSave(theater7);
 
 theaterservice.validateAndSave(theater8);
 
 theaterservice.validateAndSave(theater9);
 
 theaterservice.validateAndSave(theater10);
 
 theaterservice.validateAndSave(theater11);
 
 theaterservice.validateAndSave(theater12);
 
 theaterservice.validateAndSave(theater13);
 
 theaterservice.validateAndSave(theater14);
 
 theaterservice.validateAndSave(theater15);

  
  
  
 
	}
}

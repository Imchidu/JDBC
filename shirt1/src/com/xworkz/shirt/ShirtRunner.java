package com.xworkz.shirt;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.repo.ShirtRepo;
import com.xworkz.shirt.repo.ShirtRepoImpl;

public class ShirtRunner {
	
	public static void main(String[] args) {
		
		ShirtRepo repo=new ShirtRepoImpl();
		
		ShirtDto dto=new ShirtDto(1, "peterengland","white", "xl", true);
		ShirtDto dto1=new ShirtDto(2, "netplay","grey", "xxl", false);
		ShirtDto dto2=new ShirtDto(3, "calvinklien","blue", "xl", true);
		ShirtDto dto3=new ShirtDto(4, "depricate","green", "xl", false);
		ShirtDto dto4=new ShirtDto(5, "buffalo","black", "xxxl", true);
		
//		repo.save(dto);
//		repo.save(dto1);
//		repo.save(dto2);
		repo.save(dto3);
//		repo.save(dto4);
		
		List<ShirtDto> readAll = repo.readAll();
		System.out.println(readAll);
		
		
		ShirtDto findByName = repo.findByName("netplay");
		
		System.out.println(findByName);
		
		
		
		ShirtDto updatesizeByName = repo.updatesizeByName("L", "netplay");
		System.out.println(updatesizeByName);
		
		
		boolean deletebybrandName = repo.deletebybrandName("depricate");
		System.out.println(deletebybrandName);
		
		
		List<ShirtDto> readAll2 = repo.readAll();
		System.out.println(readAll2);
		
		
	}

}

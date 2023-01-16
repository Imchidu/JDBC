package com.xworkz.shirt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShirtDto {

	private int id;
	private String brandName;
	private String color;
	private String size;
	private boolean hasPocket;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isHasPocket() {
		return hasPocket;
	}
	public void setHasPocket(boolean hasPocket) {
		this.hasPocket = hasPocket;
	}
	
	
	
	
	public ShirtDto() {
		System.out.println("default constructor");
	}
	
	
	public ShirtDto(int id, String brandName, String color, String size, boolean hasPocket) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.color = color;
		this.size = size;
		this.hasPocket = hasPocket;
	}
	
	
	
	
	@Override
	public String toString() {
		return "ShirtDto [id=" + id + ", brandName=" + brandName + ", color=" + color + ", size=" + size
				+ ", hasPocket=" + hasPocket + "]";
	}
	
	

}

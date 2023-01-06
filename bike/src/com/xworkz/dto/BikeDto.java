package com.xworkz.dto;

public class BikeDto {
	
	private String brand;
	private String color;
	private int price;
	private int cc;
	private int noOfGears;
	
	
	public BikeDto() {
		System.out.println("Default Construction");
	}
	
	
	public BikeDto(String brand, String color, int price, int cc, int noOfGears) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.cc = cc;
		this.noOfGears = noOfGears;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getCc() {
		return cc;
	}



	public void setCc(int cc) {
		this.cc = cc;
	}



	public int getNoOfGears() {
		return noOfGears;
	}



	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}



	@Override
	public String toString() {
		return "BikeDto [brand=" + brand + ", color=" + color + ", price=" + price + ", cc=" + cc + ", noOfGears="
				+ noOfGears + "]";
	}
	
	
	
	

}

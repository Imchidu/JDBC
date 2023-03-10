package com.xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChocolateDTO {
	@Id
	private int id;
	private String brand;
	private int price;

	public ChocolateDTO() {
		System.out.println("Default constructor");
	}

	public ChocolateDTO(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

}

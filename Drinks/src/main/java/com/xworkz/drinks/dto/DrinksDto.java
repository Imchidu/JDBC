package com.xworkz.drinks.dto;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drinks")
public class DrinksDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String brand;
	private String price;
	private String color;
	
	public DrinksDto() {
		
	}

	public DrinksDto( String brand, String price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "DrinksDto [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	
	

}



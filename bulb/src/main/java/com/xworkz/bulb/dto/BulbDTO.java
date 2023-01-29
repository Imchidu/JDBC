package com.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Bulb_Details")
@NamedQuery(name = "readAll", query = "select bulb from BulbDTO bulb")
@NamedQuery(name = "findBybrandName", query = "select bulb from BulbDTO bulb where bulb.brandName =:nam")
public class BulbDTO {
	@Id
	private int id;
	private String brandName;
	private int price;
	private String size;
	private String color;

	public BulbDTO() {
		System.out.println("Default Constructor");
	}

	public BulbDTO(int id, String brandName, int price, String size, String color) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
		this.size = size;
		this.color = color;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "BulbDTO [id=" + id + ", brandName=" + brandName + ", price=" + price + ", size=" + size + ", color="
				+ color + "]";
	}

}

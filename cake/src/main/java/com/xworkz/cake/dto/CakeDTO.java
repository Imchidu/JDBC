package com.xworkz.cake.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CakeDetails")

public class CakeDTO {
	@Id
	private int id;
	private String name;
	private int price;
	private String flavour;
	private String Shape;

	public CakeDTO() {
		System.out.println("Default Constructor");
	}

	public CakeDTO(int id, String name, int price, String flavour, String shape) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.flavour = flavour;
		Shape = shape;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return Shape;
	}

	public void setShape(String shape) {
		Shape = shape;
	}

	@Override
	public String toString() {
		return "CakeDTO [id=" + id + ", name=" + name + ", price=" + price + ", flavour=" + flavour + ", Shape=" + Shape
				+ "]";
	}

}

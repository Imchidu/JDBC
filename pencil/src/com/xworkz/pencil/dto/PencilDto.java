package com.xworkz.pencil.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pencil")

public class PencilDto {
	@Id
	private int id;
	private String name;
	private int price;
	private String color;

	public PencilDto() {
		System.out.println("Default constructor");
	}

	public PencilDto(int id, String name, int price, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pencil [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}

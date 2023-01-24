package com.xworkz.biscuit.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Biscuit")
public class BiscuitDTO {
	@Id
	private int id;
	private String name;
	private int price;
	private String color;
	private String weight;

	public BiscuitDTO() {
		System.out.println("Default constructor");
	}

	public BiscuitDTO(int id, String name, int price, String color, String weight) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.weight = weight;
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

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BiscuitDTO [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", weight="
				+ weight + "]";
	}

}

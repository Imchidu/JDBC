package com.xworkz.Chocolate1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ChocoDetaials")

@NamedQuery(name = "readAll", query = "select choco from Chocolate1DTO choco ")
@NamedQuery(name = "findByColorAndWeight", query = "select choco from Chocolate1DTO choco where choco.color=:cl and choco.weight=:wt")
@NamedQuery(name = "findByPriceAndName", query = "select choco from Chocolate1DTO choco where choco.price=:pr and choco.name=:nm")
@NamedQuery(name = "updateWeightByNameAndColor", query = "update Chocolate1DTO choco set choco.weight=:wt where choco.name=:nm and choco.color=:cl ")
@NamedQuery(name = "updateNameByIdAndWeight", query = "update Chocolate1DTO choco set choco.name=:nm where choco.id=:i and choco.weight=:wt ")

@NamedQuery(name = "deleteByColorAndName", query = "delete from Chocolate1DTO choco where choco.color=:cl and choco.name=:nm")

public class Chocolate1DTO {

	@Id
	private int id;
	private String name;
	private String color;
	private String weight;
	private int price;

	public Chocolate1DTO() {
		System.out.println("Default Construtor");
	}

	public Chocolate1DTO(int id, String name, String color, String weight, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Chocolate1DTO [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + ", price="
				+ price + "]";
	}

}

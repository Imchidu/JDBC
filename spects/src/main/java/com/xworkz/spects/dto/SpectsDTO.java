package com.xworkz.spects.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "SpectsDetails")
@NamedQuery(name = "readAll", query = "select dto from SpectsDTO dto")
@NamedQuery(name = "findByShapeAndPrice", query = "select dto from SpectsDTO dto where dto.shape=:sh and dto.price=:pr")
@NamedQuery(name = "updatePriceByName", query = "update SpectsDTO dto set dto.price=:pr where dto.name=:nm")
@NamedQuery(name = "updateColorByPriceAndShape", query = "update SpectsDTO dto set dto.color=:cl where dto.price=:pr and dto.shape=:sh")
@NamedQuery(name = "deleteByPriceAndColor", query = "delete from SpectsDTO dto where dto.price=:pr and dto.color=:cl")
@NamedQuery(name = "deleteByNameAndId", query = "delete from SpectsDTO dto where dto.name=:nm and dto.id=:i")

public class SpectsDTO {

	@Id
	private int id;
	private String name;
	private String color;
	private String shape;
	private int price;

	public SpectsDTO() {
		System.out.println("No arg Constructor");
	}

	public SpectsDTO(int id, String name, String color, String shape, int price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.shape = shape;
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SpectsDTO [id=" + id + ", name=" + name + ", color=" + color + ", shape=" + shape + ", price=" + price
				+ "]";
	}

}

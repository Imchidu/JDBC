package com.xworkz.tubelight.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Tubelight")
@NamedQuery(name = "readAll", query = "select tube from TubelightDTO tube")
@NamedQuery(name = "findByName", query = "select tube from  TubelightDTO tube where tube.name=:find")
public class TubelightDTO {
	@Id
	private int id;
	private String name;
	private int price;

	public TubelightDTO() {
		System.out.println("default constructor");
	}

	public TubelightDTO(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TubelightDTO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

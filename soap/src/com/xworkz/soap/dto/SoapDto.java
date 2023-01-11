package com.xworkz.soap.dto;


public class SoapDto {
	
	private int id;
	private String name;
	private int price;
	private String color;
	private String fragrance;
	private int weight;
	private int mfg;
	private String type;
	
	public SoapDto() {
		
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

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMfg() {
		return mfg;
	}

	public void setMfg(int mfg) {
		this.mfg = mfg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SoapDto(int id, String name, int price, String color, String fragrance, int weight, int mfg, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.fragrance = fragrance;
		this.weight = weight;
		this.mfg = mfg;
		this.type = type;
	}

	@Override
	public String toString() {
		return "SoapDto [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", fragrance="
				+ fragrance + ", weight=" + weight + ", mfg=" + mfg + ", type=" + type + "]";
	}
	
	

}

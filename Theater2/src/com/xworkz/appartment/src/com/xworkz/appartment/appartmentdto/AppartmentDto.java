package com.xworkz.appartment.appartmentdto;

public class AppartmentDto {

	private String name;
	private String location;
	private int nooffloors;
	private boolean parking;

	public AppartmentDto() {

		System.out.println("Default constructor");
	}

	public AppartmentDto(String name, String location, int nooffloors, boolean parking) {
		super();
		this.name = name;
		this.location = location;
		this.nooffloors = nooffloors;
		this.parking = parking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNooffloors() {
		return nooffloors;
	}

	public void setNooffloors(int nooffloors) {
		this.nooffloors = nooffloors;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "AppartmentDto [name=" + name + ", location=" + location + ", nooffloors=" + nooffloors + ", parking="
				+ parking + "]";
	}

}

package com.xworkz.dto;

public class TheaterDTO {

	private String location;
	private int floors;
	private String name;
	private String movieName;
	private boolean parking;

	public TheaterDTO() {
		System.out.println("Default Constructor");
	}


	public TheaterDTO(String location, int floors, String name, String movieName, boolean parking) {
		super();
		this.location = location;
		this.floors = floors;
		this.name = name;
		this.movieName = movieName;
		this.parking = parking;
	}


	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TheaterDTO [location=" + location + ", floors=" + floors + ", name=" + name + ", movieName=" + movieName
				+ ", parking=" + parking + "]";
	}

}

package com.xworkz.dto;

public class Theaterdto {

	private String name;
	private String movieName;
	private int noOfFloor;
	private int noOfScreen;
	private String location;
	private int noOfSeats;
	private boolean onlineBooking;
	private boolean maintenance;
	private double ticketPrice;
	private double theaterArea;
	private boolean camera;
	private boolean airConditioner;

	public Theaterdto() {

		System.out.println("Default constructor");
	}

	public Theaterdto(String name, String movieName, int noOfFloor, int noOfScreen, String location, int noOfSeats,
			boolean onlineBooking, boolean maintenance, double ticketPrice, double theaterArea, boolean camera,
			boolean airConditioner) {
		super();
		this.name = name;
		this.movieName = movieName;
		this.noOfFloor = noOfFloor;
		this.noOfScreen = noOfScreen;
		this.location = location;
		this.noOfSeats = noOfSeats;
		this.onlineBooking = onlineBooking;
		this.maintenance = maintenance;
		this.ticketPrice = ticketPrice;
		this.theaterArea = theaterArea;
		this.camera = camera;
		this.airConditioner = airConditioner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getNoOfFloor() {
		return noOfFloor;
	}

	public void setNoOfFloor(int noOfFloor) {
		this.noOfFloor = noOfFloor;
	}

	public int getNoOfScreen() {
		return noOfScreen;
	}

	public void setNoOfScreen(int noOfScreen) {
		this.noOfScreen = noOfScreen;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public boolean isOnlineBooking() {
		return onlineBooking;
	}

	public void setOnlineBooking(boolean onlineBooking) {
		this.onlineBooking = onlineBooking;
	}

	public boolean isMaintenance() {
		return maintenance;
	}

	public void setMaintenance(boolean maintenance) {
		this.maintenance = maintenance;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getTheaterArea() {
		return theaterArea;
	}

	public void setTheaterArea(double theaterArea) {
		this.theaterArea = theaterArea;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public String toString() {
		return "Theaterdto [name=" + name + ", movieName=" + movieName + ", noOfFloor=" + noOfFloor + ", noOfScreen="
				+ noOfScreen + ", location=" + location + ", noOfSeats=" + noOfSeats + ", onlineBooking="
				+ onlineBooking + ", maintenance=" + maintenance + ", ticketPrice=" + ticketPrice + ", theaterArea="
				+ theaterArea + ", camera=" + camera + ", airConditioner=" + airConditioner + "]";
	}
	
	



}

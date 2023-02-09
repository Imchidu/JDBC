package com.xworkz.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital_info")
public class HospitalDTO {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String location;
	private String noOfPatients;
	private String noOfDoctors;
	private String noOfBeds;
	private String noOfNurse;

	public HospitalDTO() {
		super();
	}

	public HospitalDTO(String name, String location, String noOfPatients, String noOfDoctors, String noOfBeds,
			String noOfNurse) {
		super();
		this.name = name;
		this.location = location;
		this.noOfPatients = noOfPatients;
		this.noOfDoctors = noOfDoctors;
		this.noOfBeds = noOfBeds;
		this.noOfNurse = noOfNurse;
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

	public String getNoOfPatients() {
		return noOfPatients;
	}

	public void setNoOfPatients(String noOfPatients) {
		this.noOfPatients = noOfPatients;
	}

	public String getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(String noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public String getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(String noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public String getNoOfNurse() {
		return noOfNurse;
	}

	public void setNoOfNurse(String noOfNurse) {
		this.noOfNurse = noOfNurse;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + ", noOfPatients=" + noOfPatients
				+ ", noOfDoctors=" + noOfDoctors + ", noOfBeds=" + noOfBeds + ", noOfNurse=" + noOfNurse + "]";
	}

}

package com.xworkz.school.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "School_Info")
public class SchoolDTO {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String location;
	private String noOfStudents;

	public SchoolDTO() {
		super();
	}

	public SchoolDTO(int id, String name, String location, String noOfStudents) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "SchoolDTO [id=" + id + ", name=" + name + ", location=" + location + ", noOfStudents=" + noOfStudents
				+ "]";
	}

}

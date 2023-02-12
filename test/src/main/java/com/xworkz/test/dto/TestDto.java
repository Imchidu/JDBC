package com.xworkz.test.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TestData")
@NamedQuery(name = "readAll",query = "select dto from TestDto dto ")
public class TestDto {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id

	private int id;
	private String name;
	private String location;
	private String noOfStudents;
	private String duration;

	public TestDto() {
		super();
	}

	public TestDto( String name, String location, String noOfStudents, String duration) {
		super();
		
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;
		this.duration = duration;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "TestDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfStudents=" + noOfStudents
				+ ", duration=" + duration + "]";
	}

}

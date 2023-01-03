package com.xworkz.institute.dto;


	public class InstituteDto {

		private String name;
		private String location;
		private int noOfTrainers;
		private int noOfStudents;
		private String course;
		private double rating;
		
		
		public InstituteDto() {
			System.out.println("Default Cnstructor");
		}
		
		public InstituteDto(String name, String location, int noOfTrainers, int noOfStudents, String course,
				double rating) {
			super();
			this.name = name;
			this.location = location;
			this.noOfTrainers = noOfTrainers;
			this.noOfStudents = noOfStudents;
			this.course = course;
			this.rating = rating;
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


		public int getNoOfTrainers() {
			return noOfTrainers;
		}


		public void setNoOfTrainers(int noOfTrainers) {
			this.noOfTrainers = noOfTrainers;
		}


		public int getNoOfStudents() {
			return noOfStudents;
		}


		public void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}


		public String getCourse() {
			return course;
		}


		public void setCourse(String course) {
			this.course = course;
		}


		public double getRating() {
			return rating;
		}


		public void setRating(double rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "InstituteDto [name=" + name + ", location=" + location + ", noOfTrainers=" + noOfTrainers
					+ ", noOfStudents=" + noOfStudents + ", course=" + course + ", rating=" + rating + "]";
		}
		
		
		
		

	}



package com.xworkz.bag.dto;

public class BagDto {
	

		private int id;
		private String name;
		private String color;
		private double price;
		private int capacity;
		
		
		public BagDto() {
			
			System.out.println("Default constructor");
		}
		
		
		
		public BagDto(int id, String name, String color, double price, int capacity) {
			super();
			this.id = id;
			this.name = name;
			this.color = color;
			this.price = price;
			this.capacity = capacity;
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



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		public int getCapacity() {
			return capacity;
		}



		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}



		@Override
		public String toString() {
			return "BagDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", capacity="
					+ capacity + "]";
		}
		
		
		
		
		

	

}

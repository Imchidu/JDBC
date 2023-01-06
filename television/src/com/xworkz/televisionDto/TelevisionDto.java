package com.xworkz.televisionDto;

public class TelevisionDto {
	
	private String brandName;
	private int modelNo;
	private String size;
	private String type;
	private int price;
	
	public TelevisionDto() {
		System.out.println("Default Constructor");
	}

	public TelevisionDto(String brandName, int modelNo, String size, String type, int price) {
		super();
		this.brandName = brandName;
		this.modelNo = modelNo;
		this.size = size;
		this.type = type;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TelevisionDto [brandName=" + brandName + ", modelNo=" + modelNo + ", size=" + size + ", type=" + type
				+ ", price=" + price + "]";
	}

	
	
}

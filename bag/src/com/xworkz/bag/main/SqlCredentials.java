package com.xworkz.bag.main;

public enum SqlCredentials {

	URL("jdbc:mysql://localhost:3306/SOAP"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	String values;

	SqlCredentials(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;

	}

}

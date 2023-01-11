package com.xworkz.soap.constants;

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

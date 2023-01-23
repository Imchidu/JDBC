package com.xworkz.watch.constants;

public enum SqlCredentials {
	
	URL("jdbc:mysql://localhost:3306/xworkz"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	String values;
	
	SqlCredentials(String values) {
		this.values=values;
		
	}
	
	public String getValues() {
	
	return values;
	}
}
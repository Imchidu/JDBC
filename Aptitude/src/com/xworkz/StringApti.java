package com.xworkz;

public class StringApti {

	public static void main(String[] args) {

//		String string = "MaNoj      ".trim().toLowerCase();
//		StringBuffer stringBuffer = new StringBuffer(string);
//		StringBuffer reverse = stringBuffer.reverse();
//
//		String string2 = reverse.toString();
//
//		System.out.println(string2);
//
//		System.out.println("===============================");
//
//		String string3 = "";
//
//		for (int i = string.length() - 1; i >= 0; i--) {
//
//			string3 = string3 + string.charAt(i);
//
//		}
//		System.out.println(string3);
		
		
		String c="Chidanand";
		
		String c1="";
		
		for(int i=c.length()-1; i>=0;i--) {
			
			c1=c1+c.charAt(i);
			
		}
		
          System.out.println(c+" "+c1);
	
	
	
	
	String m="madhuchandra";
	String m1="";
	
	for(int i=m.length()-1;i>=0;i--) {
		m1=m1+m.charAt(i);
	}
	System.out.println(c+" "+m1);
	
	}
	
	
	

}


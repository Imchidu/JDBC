package com.xworkz;

import java.util.Arrays;

public class Salary {

	
	public double average(int[] salary) {

	       Arrays.sort(salary);

	        double sum=0;
	        int n=salary.length-2;
	        for(int i=0;i<salary.length;i++){
	            sum+=salary[i];
	        }
	        sum=sum-salary[0]-salary[salary.length-1];
	        
	        return sum/n;
	}
	
	
	
	
	public static void main(String[] args) {
		Salary s=new Salary();
		int[] salary= {1000,2000,4000,3000};
		double s1=s.average(salary);
		System.out.println(s1);
	
		
		
		
	}

}

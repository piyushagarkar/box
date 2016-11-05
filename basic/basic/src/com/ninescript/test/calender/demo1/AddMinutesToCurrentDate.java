package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class AddMinutesToCurrentDate {

	public static void main(String[] args) {
		
		Calendar now= Calendar.getInstance();
		
		System.out.println("Current Time : "+ Calendar.HOUR_OF_DAY+":"+
							
						now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
		
		now.add(Calendar.MINUTE,20);
		
		System.out.println("Time After adding 20 Minutes :" +(now.get(Calendar.HOUR_OF_DAY))
				
						+"-"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
	
	now=Calendar.getInstance();
	now.add(Calendar.MINUTE,-50);
	
	System.out.println("Time after substrating 50 min : "+now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+
			":"+now.get(Calendar.SECOND));
	
	
	}
	
	
}

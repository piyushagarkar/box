package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class AddSecondsToCurrentDate {

	
	public static void main(String[] args) {
		
		Calendar now=Calendar.getInstance();
		System.out.println("Current Time is :"+now.get(Calendar.HOUR_OF_DAY)+
		
					":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
		
		now.add(Calendar.SECOND,100);
		
		System.out.println("Timing after adding 100 seconds :"+now.get(Calendar.HOUR_OF_DAY)
				
						+":"+now.get(Calendar.MILLISECOND)+":"+now.get(Calendar.SECOND));
	}
}

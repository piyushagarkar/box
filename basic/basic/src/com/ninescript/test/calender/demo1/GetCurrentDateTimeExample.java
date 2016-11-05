package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class GetCurrentDateTimeExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.println("Current Year is : "+ now.get(Calendar.YEAR ));
		
		System.out.println("Current MONTH is : "+ (now.get(Calendar.MONTH) + 1 ));
		
		System.out.println("Current Date is : " + now.get(Calendar.DATE));
		
	
		System.out.println("Current Hour in 12 hour format is : " + now.get(Calendar.HOUR));
		System.out.println("Current Hour in 24 hour format is : " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("Current Minute is : " + now.get(Calendar.MINUTE));
		System.out.println("Current Second is : " + now.get(Calendar.SECOND));
		System.out.println("Current Millisecond is : " + now.get(Calendar.MILLISECOND));
		
		
		System.out.println("Current full date time is : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE)
				+ "-" + now.get(Calendar.YEAR) + " " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE)
			+ ":" + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));	
		
		
		
	}
}

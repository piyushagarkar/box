package com.ninescript.test.calender.demo1;

import java.util.Calendar;
import java.util.TimeZone;

public class GetCurrentTimeZone {

	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
		TimeZone timezon= now.getTimeZone();
		
		System.out.println("Current time zone is : " + timezon.getDisplayName());
		
	} 
}

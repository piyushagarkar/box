package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class GetTimeInMilliSeconds {

	public static void main(String[] args) {
		
		Calendar now  = Calendar.getInstance();
		
		System.out.println("Current millseconds since Jan 1 1970 are :"+ now.getTimeInMillis());
		
	}
}


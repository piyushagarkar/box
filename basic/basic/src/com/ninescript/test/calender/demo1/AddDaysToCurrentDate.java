package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class AddDaysToCurrentDate {
	
	public static void main(String[] args) {
		
		Calendar now =Calendar.getInstance();
		
		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
	
		now.add(Calendar.DATE,1);
		
		System.out.println("Date after the one day : " +(now.get(Calendar.MONTH) + 1));
	
		
	
	}
}


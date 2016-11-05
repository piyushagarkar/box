package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class CompareDateTimesUsingAfter {
	
	public static void main(String[] args) {
		
	

	
	Calendar futureCal= Calendar.getInstance();
	
	futureCal.set(Calendar.YEAR, 2010);
	
	
		Calendar now = Calendar.getInstance();
		
		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		System.out.println("Is futureCal after now ? : " + futureCal.after(now));
	}

}
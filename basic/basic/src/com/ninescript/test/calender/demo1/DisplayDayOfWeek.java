package com.ninescript.test.calender.demo1;


import java.util.Calendar;

public class DisplayDayOfWeek {
	
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

				String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };

		
		System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);

	}


}

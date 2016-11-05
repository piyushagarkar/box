package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class DisplayMonthOfYear {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" +
				now.get(Calendar.DATE)+ "-" + now.get(Calendar.YEAR));
		
		
		String[] strMonths = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
		"Dec" };

		
		System.out.println("Current month is : " + strMonths[now.get(Calendar.MONTH)]);
				
	}
}

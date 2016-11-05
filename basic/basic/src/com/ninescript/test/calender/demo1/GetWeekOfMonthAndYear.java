package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class GetWeekOfMonthAndYear {
	
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		System.out.println("Current Week Of Month Is: "+ now.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("Current Week Of Year IS : "+ now.get(Calendar.WEEK_OF_YEAR));
		
		now.add(Calendar.WEEK_OF_MONTH,1);
		
		System.out.println("Date After One Year :" + (now.get(Calendar.MONTH) + 1 )+"-"+ now.get(Calendar.DATE)+
				"-"+ now.get(Calendar.YEAR));
		
	}

}

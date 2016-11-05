package com.ninescript.test.calender.demo1;

import java.util.Calendar;



public class AddWeeksToCurrentWeek {

	public static void main(String[] args) {
		
		Calendar now =Calendar.getInstance();
		
		System.out.println("Current date is : "+(now.get(Calendar.MONTH) + 1)+"-"+now.get(Calendar.DATE)+
													"-"+now.get(Calendar.YEAR));
		
		System.out.println("Current Week of Month is :"+now.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("Current Week of year is : "+now.get(Calendar.WEEK_OF_YEAR));
		
		now.add(Calendar.WEEK_OF_YEAR,1);
		
		System.out.println("Date afte one week :"+(now.get(Calendar.MONTH)+1) +":"+
		
									
				now.get(Calendar.DATE)+":"+now.get(Calendar.YEAR));
		
		now=Calendar.getInstance();
		now.add(Calendar.WEEK_OF_YEAR, -50);
		
		System.out.println("Date befor 50 weeks :"+(now.get(Calendar.MONTH) +1 )+":"+now.get(Calendar.DATE)+
				":"+now.get(Calendar.YEAR));
		
		
	}
}

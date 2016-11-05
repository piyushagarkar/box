package com.ninescript.test.calender.demo1;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
	

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal= Calendar.getInstance();
		System.out.println("Calenare toString() is : "+cal+"\n");
		System.out.println("Current Time Zone is "+cal.getTimeZone()+"\n");
		
		Date date=cal.getTime();
		System.out.println("Current date and time in Date's toString() is : " + date + "\n");
		
		System.out.println("Year "+ cal.get(Calendar.YEAR) );
		System.out.println("Month "+ cal.get(Calendar.MONTH) );
		System.out.println("DAY of the Month "+ cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY of the Week "+ cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY of the Year "+ cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("Week Of Year "+ cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week Of Month"+ cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DAY of the Week In Month "+ cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("HOUR "+ cal.get(Calendar.HOUR));
		System.out.println("AM_PM "+ cal.get(Calendar.AM_PM));
		System.out.println("HOUR OF THE DAY "+ cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE "+ cal.get(Calendar.MINUTE));
		System.out.println("SECOND "+ cal.get(Calendar.SECOND));
		System.out.println();
		
		Calendar calTemp;
		
		calTemp=(Calendar)  cal.clone();
		calTemp.add(Calendar.DAY_OF_YEAR, -365);
		System.out.println("365 Days ago, it was "+calTemp.getTime());
		
		
		calTemp=(Calendar) cal.clone();
		calTemp.add(Calendar.HOUR_OF_DAY, 11);
		System.out.println("After 11 Hours It will Be "+calTemp.getTime());
		
		
		calTemp=(Calendar) cal.clone();
		calTemp.roll(Calendar.HOUR_OF_DAY,11);
		System.out.println("Roll 11 Hours it will be "+ calTemp.getTime());
		System.out.println();

	}
	
}

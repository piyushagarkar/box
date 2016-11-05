package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class AddHoursToCurrentDate {
	
	public static void main(String[] args) {
		
		Calendar now= Calendar.getInstance();
		
		System.out.println("Current Date : "+ (now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+"-"+
						
							now.get(Calendar.YEAR));
		
		System.out.println("Current Time : "+ (now.get(Calendar.HOUR_OF_DAY)) +":"+
					
							now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND) );
		
		
							now.add(Calendar.HOUR,10);	
		
		System.out.println("New time adding after 10 hours : "+now.get(Calendar.HOUR_OF_DAY)+":"+
						
							now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
		
		System.out.println("New Date after adding 10 Houres "+
		
						now.get(Calendar.MONTH) +"-"+ now.get(Calendar.DATE)+"-"+now.get(Calendar.SECOND));

	now=Calendar.getInstance();
	now.add(Calendar.HOUR,-3);
	
	System.out.println("Time befor 3 hours : "+now.get(Calendar.HOUR_OF_DAY)+":"+
					
							now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
	}

}

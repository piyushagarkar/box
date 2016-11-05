package com.ninescript.test.calender.demo1;

import java.util.Calendar;


public class AddYearToCurrentDate {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.println("Current Date is : "+(now.get(Calendar.MONTH)+1)+":"+ 
		
								now.get(Calendar.DATE)+":"+now.get(Calendar.YEAR));
		
		now.add(Calendar.YEAR, 1);
		
		
		System.out.println("Date after one year :"+(now.get(Calendar.MONTH)+1)+":"+
		
									now.get(Calendar.DATE)+":"+now.get(Calendar.YEAR));
	
		now=Calendar.getInstance();
		now.add(Calendar.YEAR,-100);
		
	System.out.println("DAte befor 100 years"+(now.get(Calendar.MONTH)+1)+":"+ 
			
						now.get(Calendar.DATE)+":"+now.get(Calendar.YEAR));
	}

}

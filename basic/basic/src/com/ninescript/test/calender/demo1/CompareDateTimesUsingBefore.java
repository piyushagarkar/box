package com.ninescript.test.calender.demo1;

import java.util.Calendar;

public class CompareDateTimesUsingBefore {
	
	public static void main(String[] args) {
		
		Calendar old= Calendar.getInstance();
		
		old.set(Calendar.YEAR, 1990);
		
		Calendar now= Calendar.getInstance();
		
		System.out.println("IS Old Befor Now ? : "+ old.before( now));
		
		
	}

}

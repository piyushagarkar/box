package com.ninescript.test.date.formattingdemo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddAMPMToFormattedDate {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		String strDateFormat =  "HH:MM:ss a" ;
		
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Time with AM/PM Field "+ sdf.format(date));
	}
}

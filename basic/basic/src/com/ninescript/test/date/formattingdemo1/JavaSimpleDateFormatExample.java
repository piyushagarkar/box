package com.ninescript.test.date.formattingdemo1;


import java.text.SimpleDateFormat;
import java.util.Date;
 
 

public class JavaSimpleDateFormatExample {

	public static void main(String args[]) {

		
		Date date = new Date();
		
		String DATE_FORMAT = "MM/dd/yyyy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

		
		System.out.println("Today is " + sdf.format(date));

	}

}


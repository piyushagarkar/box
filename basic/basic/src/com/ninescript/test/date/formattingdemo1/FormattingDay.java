package com.ninescript.test.date.formattingdemo1;


import java.text.SimpleDateFormat;
import java.util.Date;


public class FormattingDay {

	public static void main(String[] args) {

	
		Date date = new Date();

	
		String strDateFormat = "d";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("Current day in d format : " + sdf.format(date));

	
		strDateFormat = "dd";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Current day in dd format : " + sdf.format(date));
	}
}
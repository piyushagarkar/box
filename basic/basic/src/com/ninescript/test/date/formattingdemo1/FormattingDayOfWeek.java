package com.ninescript.test.date.formattingdemo1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FormattingDayOfWeek {

	public static void main(String[] args) {

	
		Date date = new Date();

		
		String strDateFormat = "E";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("Current day of week in E format : " + sdf.format(date));

		
		strDateFormat = "EEEE";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Current day of week in EEEE format : " + sdf.format(date));
	}
}




package com.ninescript.test.date.formattingdemo1;


import java.text.SimpleDateFormat;
import java.util.Date;


public class FormattingSeconds {

	public static void main(String[] args) {

		
		Date date = new Date();

		
		String strDateFormat = "s";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("seconds in s format : " + sdf.format(date));

		
		strDateFormat = "ss";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("seconds in ss format : " + sdf.format(date));
	}
}

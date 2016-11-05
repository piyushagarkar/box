package com.ninescript.test.date.formattingdemo1;


import java.text.SimpleDateFormat;
import java.util.Date;



public class FormattingMinute {

	public static void main(String[] args) {

		
		Date date = new Date();

		
		String strDateFormat = "m";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("minutes in m format : " + sdf.format(date));

		
		strDateFormat = "mm";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("minutes in mm format : " + sdf.format(date));
	}
}

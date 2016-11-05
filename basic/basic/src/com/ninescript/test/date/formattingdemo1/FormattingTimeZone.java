package com.ninescript.test.date.formattingdemo1;


import java.text.SimpleDateFormat;
import java.util.Date;


public class FormattingTimeZone {

	public static void main(String[] args) {


		Date date = new Date();


		String strDateFormat = "zzz";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("TimeZone in z format : " + sdf.format(date));


		strDateFormat = "zzzz";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("TimeZone in zzzz format : " + sdf.format(date));

		strDateFormat = "Z";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("TimeZone in Z format : " + sdf.format(date));
	}
}


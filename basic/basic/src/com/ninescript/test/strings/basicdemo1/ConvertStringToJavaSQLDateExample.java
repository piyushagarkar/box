package com.ninescript.test.strings.basicdemo1;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ConvertStringToJavaSQLDateExample {

	public static void main(String args[]) throws ParseException {

		// string containing date
		String strDate = "2016-05-22 00:00:00";

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		java.util.Date date = sdf.parse(strDate);

		java.sql.Date sqlDate = new Date(date.getTime());

		System.out.println("String converted to java.sql.Date :" + sqlDate);
	}

}

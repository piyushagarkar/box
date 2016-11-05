package com.ninescript.test.strings.basicdemo1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ConvertDateToStringExample {

	public static void main(String args[]) {

		// create new java.util.Date object
		Date date = new Date();

		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		
		String strDate = dateFormat.format(date);

		System.out.println("Date converted to String: " + strDate);

	}
}

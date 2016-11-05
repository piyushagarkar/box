package com.ninescript.test.date.formattingdemo1;

import java.text.SimpleDateFormat;
import java.util.*;


public class FormattingMonth {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		String strDateFormat = "M";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("Current Month in M format : " + sdf.format(date));

		strDateFormat = "MM";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Current Month in MM format : " + sdf.format(date));
		
		strDateFormat = "MMM";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Current Month in MMM format : " + sdf.format(date));

		
		strDateFormat = "MMMM";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Current Month in MMMM format : " + sdf.format(date));


	}
}

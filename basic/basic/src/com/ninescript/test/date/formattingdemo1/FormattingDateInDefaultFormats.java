package com.ninescript.test.date.formattingdemo1;

import java.text.DateFormat;
import java.util.Date;

public class FormattingDateInDefaultFormats {
	
	public static void main(String[] args) {
		
		Date date = new Date();

		
		String strDate = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		System.out.println(strDate);

		
		strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
	
		 
		System.out.println(strDate);
		strDate = DateFormat.getDateInstance(DateFormat.LONG).format(date);
		System.out.println(strDate);
		
		
		strDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
		System.out.println(strDate);
	}
	
	

}

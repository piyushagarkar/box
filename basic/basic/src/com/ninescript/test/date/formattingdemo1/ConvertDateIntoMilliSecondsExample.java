package com.ninescript.test.date.formattingdemo1;

import java.util.*;


public class ConvertDateIntoMilliSecondsExample {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Cureent Date is :" + date);
		
		System.out.println("Milliseconds since January 1, 1970, 00:00:00 GMT : " + date.getTime());

	}
}

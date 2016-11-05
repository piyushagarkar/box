package com.ninescript.test.date.formattingdemo1;

import java.util.Date;


public class CompareDateUsingCompareToExample {

	
	public static void main(String[] args) {
		
	
		Date d1 = new Date();

	
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}


		Date d2 = new Date();

		System.out.println("First Date : " + d1);
		System.out.println("Second Date : " + d2);

		int results = d1.compareTo(d2);

		if (results > 0)
			System.out.println("First Date is after second");
		else if (results < 0)
			System.out.println("First Date is before second");
		else
			System.out.println("Both dates are equal");
	}


		
	
}

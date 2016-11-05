package com.ninescript.test.date.formattingdemo1;

import java. util.Date;


public class CompareDateUsingAfterExample {


	public static void main(String[] args) {

		Date d1 = new Date();

		try{
			Thread.sleep(10);
		}
		catch(Exception e){

		}
		
		Date d2 = new Date();
		
		System.out.println("First Date : "+ d1);
		System.out.println("Second Date : "+d2);
		System.out.println("Is second Date is after First : " +d2.after(d1));

	}
}


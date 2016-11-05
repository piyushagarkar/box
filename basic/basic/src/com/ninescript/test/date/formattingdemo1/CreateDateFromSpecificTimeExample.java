package com.ninescript.test.date.formattingdemo1;

import java.util.Date;

public class CreateDateFromSpecificTimeExample {

	public static void main(String[] args) {
		
		Date date = new Date( 365L * 24L * 60L * 60L * 1000L);
		
		System.out.println(date);
	
	}
}

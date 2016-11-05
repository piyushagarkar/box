package com.ninescript.test.calender.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author piyush
 *
 */

public class DateTest {
	
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(" toString(): "+now);
		
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
		System.out.println("Format 1:   " + dateFormatter.format(now));

		dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Format 2:   " + dateFormatter.format(now));

		dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		System.out.println("Format 3:   " + dateFormatter.format(now));
	}
	

}

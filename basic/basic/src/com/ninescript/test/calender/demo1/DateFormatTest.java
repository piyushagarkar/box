package com.ninescript.test.calender.demo1;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * 
 * @author Piyush
 *
 */

public class DateFormatTest {
	
	public static void main(String[] args) {

		Date now= new Date();
		
		System.out.println(now);

				DateFormat formatter = DateFormat.getInstance();
				String dateStr= formatter.format(now);
				System.out.println(dateStr);
				formatter = DateFormat.getTimeInstance();
				System.out.println(formatter.format(now));
				
			
				formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRANCE);
				System.out.println(formatter.format(now));
				
				SimpleDateFormat simpaledateformatter = new SimpleDateFormat("E YYYY.MM.dd 'at' hh:mm:ss a zzz ");
				System.out.println(simpaledateformatter.format(now));
				
		
	}

}

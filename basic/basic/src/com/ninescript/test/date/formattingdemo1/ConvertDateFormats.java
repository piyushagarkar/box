package com.ninescript.test.date.formattingdemo1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ConvertDateFormats {

	
	public static void main(String[] args) {
		
		String strDate = "21/05/1994";
		
		try{
			
			SimpleDateFormat sdfSource = new SimpleDateFormat("dd/MM/yy");
			
			Date date =sdfSource.parse(strDate);
			
			SimpleDateFormat sdfDestination = new SimpleDateFormat("MM-dd-yyyy hh:mm;ss");
			
			strDate = sdfDestination.format(date);
			
			System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");
			System.out.println("Converted date is : " + strDate);

		}
			catch(ParseException pe){
				System.out.println("Parse Exception is :"+ pe);
				
			}
			
	}
}


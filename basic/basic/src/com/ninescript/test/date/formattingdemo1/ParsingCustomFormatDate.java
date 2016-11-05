package com.ninescript.test.date.formattingdemo1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParsingCustomFormatDate {

	public static void main(String[] args) {


		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

		try {

			Date date = sdf.parse("21/05/16");
			System.out.println(date);
		}
		catch (ParseException pe) {
			System.out.println("Parse Exception : " + pe);
		}
	}
}
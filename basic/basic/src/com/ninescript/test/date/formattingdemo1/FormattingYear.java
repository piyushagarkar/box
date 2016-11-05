package com.ninescript.test.date.formattingdemo1;

import java.text.*;
import java.util.*;


public class FormattingYear {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		String strDateFormat= "yy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		
		System.out.println(" Current year in yy format "+ sdf.format(date));
		
		strDateFormat = "yyyy";
		sdf = new SimpleDateFormat(strDateFormat);
		System.out.println("Current year in yyyy format " + sdf.format(date));
		
	}
}

package com.ninescript.test.date.formattingdemo1;

import java.text.SimpleDateFormat;
import java.util.*;


public class FormattingHour {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		String strDateFormat ="h";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in h format : " + sdf.format(date));

		
		strDateFormat = "hh";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in hh format : " + sdf.format(date));

		
		strDateFormat = "H";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in H format : " + sdf.format(date));

		
		strDateFormat = "HH";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in HH format : " + sdf.format(date));

		strDateFormat = "k";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in k format : " + sdf.format(date));

	
		strDateFormat = "kk";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in kk format : " + sdf.format(date));

		strDateFormat = "K";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in K format : " + sdf.format(date));

	
		strDateFormat = "KK";
		sdf = new SimpleDateFormat(strDateFormat);

		System.out.println("hour in KK format : " + sdf.format(date));

	}

}

	
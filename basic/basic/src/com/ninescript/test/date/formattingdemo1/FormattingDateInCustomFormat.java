package com.ninescript.test.date.formattingdemo1;

import java.util.Date;
import java.text.SimpleDateFormat;


public class FormattingDateInCustomFormat {


	public static void main(String[] args) {

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		String strDate = sdf.format(date);


		sdf = new SimpleDateFormat("dd/MM/yyyy");
		strDate = sdf.format(date);
		System.out.println("formatted date in dd/MM/yyyy : " + strDate);

		sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		strDate = sdf.format(date);
		System.out.println("formatted date in mm-dd-yyyy hh:mm:ss : " + strDate);


	}
}

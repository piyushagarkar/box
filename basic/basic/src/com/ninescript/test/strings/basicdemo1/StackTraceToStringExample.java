package com.ninescript.test.strings.basicdemo1;

import java.io.PrintWriter;
import java.io.StringWriter;



public class StackTraceToStringExample {
	

	public static void main(String args[]) {

		try {

			
			Integer.parseInt("Not a number");

		} catch (NumberFormatException e) {

			
			StringWriter sWriter = new StringWriter();

			// create PrintWriter for StringWriter
			PrintWriter pWriter = new PrintWriter(sWriter);

			// now print the stacktrace to PrintWriter we just created
			e.printStackTrace(pWriter);

			// use toString method to get stacktrace to String from StringWriter
			// object
			
			String strStackTrace = sWriter.toString();

			System.out.println("Stacktrace converted to String: " + strStackTrace);
		}
	}

}
package com.ninescript.test.strings.basicdemo1;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */
public class ArrayListToStringArrayExample {

	public static void main(String args[]) {
		
		// ArrayList containing string objects
		ArrayList<String> aListDays = new ArrayList<String>();
		aListDays.add("Sunday");
		aListDays.add("Monday");
		aListDays.add("Tuesday");

		
		// First Step: convert ArrayList to an Object array.
		Object[] objDays = aListDays.toArray();

		// Second Step: convert Object array to String array
		String[] strDays = Arrays.copyOf(objDays, objDays.length, String[].class);

		System.out.println("ArrayList converted to String array");

		// print elements of String array
		for (int i = 0; i < strDays.length; i++) {
			System.out.println(strDays[i]);
		}

	}
			
	}
	


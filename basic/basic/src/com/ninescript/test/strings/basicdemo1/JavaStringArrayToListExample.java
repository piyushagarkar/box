package com.ninescript.test.strings.basicdemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;


public class JavaStringArrayToListExample {

	public static void main(String args[]) {

		// create String array
		String[] numbers = new String[] { "one", "two", "three" };

		

		List list = (List) Arrays.asList(numbers);

		// display elements of List
		System.out.println("String array converted to List");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		List anotherList = new ArrayList();

		Collections.addAll(anotherList, numbers);
	}
}
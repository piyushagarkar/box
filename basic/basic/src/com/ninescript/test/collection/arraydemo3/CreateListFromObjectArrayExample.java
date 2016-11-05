package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreateListFromObjectArrayExample {

	public static void main(String[] args) {
		
		String [] strArray = new String[] {"Monday", "Piyush ", " Rohit", " Raj " };
		
		List list = Arrays.asList(strArray);
		
		Iterator iterator = list.iterator();
		
		System.out.println("List Is Created From Array of Type Object Contain ");
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}

package com.ninescript.test.collection.arraylistdemo2;

import java.util.*;


public class GetSizeOfArrayListExample {

	
	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		
		int toltalElements = arraylist.size();
		

		System.out.println("Size Of Array List Is:  "+ toltalElements);
		
		System.out.println(" Array List Contain ");
						
		for (int index = 0; index < toltalElements; index++)
			System.out.println(arraylist.get(index));
		
		
		
	}
}

package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;


public class ObjectArrayFromElementsOfLinkedListExample {

	
	public static void main(String[] args) {
		
		LinkedList lList  = new  LinkedList();
		
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("555");
		lList.add("5");
		
		Object [] array = lList.toArray();

		System.out.println("Object array created from Java LinkedList.");
		System.out.println("Object array contains : ");
		
		for (int i = 0; i < array.length; i++) {

			//System.out.println(i);
			System.out.println(array[i]);
		}
	}
}

package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;


public class CheckElementLinkedListExample {

	public static void main(String[] args) {

		LinkedList lList = new LinkedList();

		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		
		
		boolean bElement = lList.contains("4");

		if (bElement) {
			
			System.out.println("LinkedList contains 4");
		
		} else {
			
			System.out.println("LinkedList does not contain 4");
		}
	}
}



package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;


public class GetFirstAndLastElementLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList lList = new LinkedList();
		
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		
		System.out.println("First element of LinkedList is : " + lList.getFirst());
		
		System.out.println("First element of LinkedList is : " + lList.getLast());
		
		
	}
}

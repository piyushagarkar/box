package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;

public class AddElementsAtStartEndLinkedListExample {

	public static void main(String[] args) {
		
		
		LinkedList lList = new LinkedList();
		
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		
		System.out.println("Linked List Contais: "+ lList);
		
		lList.addFirst("555");
		System.out.println("After inserting 0 at beginning, LinkedList contains :" + lList);

		
		lList.addLast("6");
		System.out.println("After appending 0 at end, LinkedList contains :" + lList);

		
	}
}

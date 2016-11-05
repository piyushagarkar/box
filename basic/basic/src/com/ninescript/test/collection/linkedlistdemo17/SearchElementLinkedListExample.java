package com.ninescript.test.collection.linkedlistdemo17;



import java.util.LinkedList;

public class SearchElementLinkedListExample {

	public static void main(String[] args) {

		
		LinkedList lList = new LinkedList();

	
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("2");

		int index = lList.indexOf("2");
		if (index != -1) {
			System.out.println("First occurrence of 2 in LinkedList is at index : " + index);
		} else {
			System.out.println("LinkedList does not contain 2");
		}

	
		index = lList.lastIndexOf("2");
		if (index != -1) {
			System.out.println("Last occurrence of 2 in LinkedList is at index : " + index);
		} else {
			System.out.println("LinkedList does not contain 2");
		}

	}
}

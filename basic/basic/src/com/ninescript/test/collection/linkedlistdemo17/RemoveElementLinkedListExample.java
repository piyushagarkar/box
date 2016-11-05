package com.ninescript.test.collection.linkedlistdemo17;


import java.util.LinkedList;

public class RemoveElementLinkedListExample {

	public static void main(String[] args) {
		
	
		LinkedList lList = new LinkedList();

	
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

	

		boolean isRemoved = lList.remove("2");
		System.out.println("Is 2 removed from LinkedList ? :" + isRemoved);
		System.out.println("LinkedList now contains : " + lList);

		

		Object obj = lList.remove(2);
		System.out.println(obj + " has been removed from LinkedList");
		System.out.println("LinkedList now contains : " + lList);
	}
}

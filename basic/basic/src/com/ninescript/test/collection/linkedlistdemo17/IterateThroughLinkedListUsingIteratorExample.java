package com.ninescript.test.collection.linkedlistdemo17;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateThroughLinkedListUsingIteratorExample {
	
	
	public static void main(String[] args) {
		
		
		LinkedList lList = new LinkedList();


		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");


		Iterator itr = lList.iterator();

		System.out.println("Iterating through elements of Java LinkedList...");
		System.out.println("LinkedList contains : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	
	}
	
	

}

package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateLinkedListUsingListIteratorExample {

	public static void main(String[] args) {
		
			LinkedList lList = new LinkedList();
			
			lList.add("1");
			lList.add("2");
			lList.add("3");
			lList.add("4");
			lList.add("5");
			lList.add("6");
			lList.add("7");
	
			
			ListIterator ltr = lList.listIterator();
			
			System.out.println("Iterating through elements of Java LinkedList using ListIterator in forward direction...");
			while(ltr.hasNext())
				System.out.println(ltr.next());
			
			
			System.out.println("Iterating through elements of Java LinkedList using ListIterator in reverse direction...");
			while(ltr.hasPrevious())
				System.out.println(ltr.previous());
			
	}

	
}

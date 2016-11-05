package com.ninescript.test.collection.iteratordemo9;

import java.util.ArrayList;
import java.util.ListIterator;



public class AddAnElementUsingListIteratorExample {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		
	ListIterator listIterator = arr.listIterator();
	
	
		listIterator.next();
		
	    listIterator.add("Added Element");
	    

	    System.out.println("After inserting element, ArrayList contains");
	    for(int intIndex = 0; intIndex < arr.size(); intIndex++)
	      System.out.println(arr.get(intIndex));
		
	}
	
}

package com.ninescript.test.collection.arraylistdemo2;

import java.util.ArrayList;
import java.util.ListIterator;

import com.ninescript.arrayUse.Array;


public class IterateThroughArrayListUsingListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");

			
		ListIterator lis = arraylist.listIterator();
		
		System.out.println("Iterating through ArrayList elements in forward direction...");
	    while(lis.hasNext())
	      System.out.println(lis.next());
	    
	
	    System.out.println("Iterating through ArrayList elements in backward direction...");
	    while(lis.hasPrevious())
	      System.out.println(lis.previous());


		
	}
}

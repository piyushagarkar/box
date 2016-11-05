package com.ninescript.test.collection.iteratordemo9;

import java.util.ArrayList;
import java.util.ListIterator;

public class GetPreviousAndNextIndexListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList aList = new ArrayList();
		
		aList.add("1");
	    aList.add("2");
	    aList.add("3");
	    aList.add("4");
	    aList.add("5");
	    
	    ListIterator listIterator = aList.listIterator();
	    
	    System.out.println("Previous Index is : " + listIterator.previousIndex());  
	    System.out.println("Next Index is : " + listIterator.nextIndex());

	    
	    listIterator.next();

	    System.out.println("After increasing current position by one element : ");
	    System.out.println("Previous Index is : " + listIterator.previousIndex());  
	    System.out.println("Next Index is : " + listIterator.nextIndex());


	}
	

}

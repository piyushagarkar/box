package com.ninescript.test.collection.arraylistdemo2;

import java.util.*;

/**
 * 
 * @author piyush
 *
 */

public class IterateThroughArrayListUsingIteratorExample {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		
		Iterator it = arraylist.iterator();
		
		System.out.println("Itreator Through ArrayList : ");
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
}

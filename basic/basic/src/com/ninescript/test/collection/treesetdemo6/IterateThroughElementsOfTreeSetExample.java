package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;
import java.util.Iterator;

/**
 * 
 * @author User 37
 *
 */

public class IterateThroughElementsOfTreeSetExample {

	
	public static void main(String[] args) {

		
		TreeSet tSet = new  TreeSet();
		
		tSet.add(new Integer("1"));
	    tSet.add(new Integer("2"));
	    tSet.add(new Integer("3"));

	    
	    Iterator itr = tSet.iterator();
	    
	    System.out.println("Iterator Tree Contain");
	    while(itr.hasNext())
	    	System.out.println(itr.next());
	    
	}
}

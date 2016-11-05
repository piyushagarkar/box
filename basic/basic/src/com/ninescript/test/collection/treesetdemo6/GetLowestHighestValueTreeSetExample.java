/**
 * 
 */
package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;

/**
 * @author User 37
 *
 */
public class GetLowestHighestValueTreeSetExample {
	
	public static void main(String[] args) {
		

		TreeSet tSet = new TreeSet();
		
		tSet.add("1");
	    tSet.add("3");
	    tSet.add("2");
	    tSet.add("5");
	    tSet.add("4");
	    
	    System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());

	    System.out.println("Highest value stored in Java TreeSet is : " + tSet.last());
	    
	    
	    
	}

}

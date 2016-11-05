/**
 * 
 */
package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;

/**
 * @author User 37
 *
 */
public class RemoveAllElementsFromTreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tSet = new TreeSet();
		

	    tSet.add(new Integer("1"));
	    tSet.add(new Integer("2"));
	    tSet.add(new Integer("3"));

	    tSet.clear();
	    System.out.println("Tree set After Removal "+ tSet);
	    
	    System.out.println(" Is Tree Set Is Empty? : " + tSet.isEmpty());
	    
	  	
	}
}

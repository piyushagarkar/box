/**
 * 
 */
package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;


/**
 * @author User 37
 *
 */
public class GetSizeOfJavaTreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tSet = new TreeSet();
		
	    System.out.println("Size of TreeSet : " + tSet.size());

			tSet.add(new Integer("1"));
		    tSet.add(new Integer("2"));
		    tSet.add(new Integer("3"));


		    System.out.println("Size of TreeSet : " + tSet.size());

		    tSet.remove(new Integer("2"));
		    
		    System.out.println("Size of TreeSet after removal : " + tSet.size());

		    
	}
}

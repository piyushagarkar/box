/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;

/**
 * @author User 37
 *
 */
public class SortCharArrayExample {

	
	public static void main(String[] args) {
		
		char[] c1 = new char [] {'d','a','f','k','e'};
		

	    System.out.print("Original Array :\t ");
	    for(int index=0; index < c1.length ; index++)
	      System.out.print("  "  + c1[index]);
	    
	    
	    Arrays.sort(c1);
	    
	    System.out.println("\nSorted char array :\t ");
	    for (int i = 0; i < c1.length; i++) {
	    	System.out.println("  "  + c1[i]);
			
		}
	    
	    char[] c2 = new char[]{'d','a','f','k','e'};
	    Arrays.sort(c2,1,4);

	    System.out.print("\nPartially Sorted char array :\t ");
	    for(int index=0; index < c2.length ; index++)
	      System.out.print("  "  + c2[index]);

	}
}

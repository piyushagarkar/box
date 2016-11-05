/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;
/**
 * @author User 37
 *
 */
public class SortShortArrayExample {
	
	public static void main(String[] args) {
		
	
	
	 short[] s1 = new short[]{3,2,5,4,1};

	   
	    System.out.print("Original Array :\t ");
	    for(int index=0; index < s1.length ; index++)
	      System.out.print("  "  + s1[index]);

	    Arrays.sort(s1);

	    
	    System.out.print("\nSorted short array :\t ");
	    for(int index=0; index < s1.length ; index++)
	      System.out.print("  "  + s1[index]);
	     
	  
	    short[] s2 = new short[]{5,2,3,1,4};
	    Arrays.sort(s2,1,4);

	   
	    System.out.print("\nPartially Sorted short array :\t ");
	    for(int index=0; index < s2.length ; index++)
	      System.out.print("  "  + s2[index]);

}

	
}
/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;
/**
 * @author User 37
 *
 */
public class SortDoubleArrayExample {

	public static void main(String[] args) {
		
		double[] d1 = new double[]{3,2,5,4,1};
		
		
		

	    System.out.print("Original Array :\t ");
	    for(int index=0; index < d1.length ; index++)
	      System.out.print("  "  + d1[index]);

	    
	    
	    Arrays.sort(d1);
	    
	    

	    System.out.print("\nSorted double array :\t ");
	    for(int index=0; index < d1.length ; index++)
	      System.out.print("  "  + d1[index]);
	     
	    

	    double[] d2 = new double[]{5,2,3,1,4};
	    Arrays.sort(d2,1,4);

	  
	    System.out.print("\nPartially Sorted double array :\t ");
	    for(int index=0; index < d2.length ; index++)
	      System.out.print("  "  + d2[index]);

	  
	}
}

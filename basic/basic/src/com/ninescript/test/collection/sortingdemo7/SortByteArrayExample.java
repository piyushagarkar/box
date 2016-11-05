/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;
/**
 * @author Piyush
 *
 */
public class SortByteArrayExample {

	public static void main(String[] args) {
		
		byte[] b1 = new byte[] {3,2,5,4,2,1};
		
		System.out.println("Orignal Array :\t");
		for (int i = 0; i < b1.length; i++) {
			System.out.println("  "  + b1[i]);
		}
		
		
		Arrays.sort(b1);
		System.out.print("\nSorted byte array :\t ");
	    for(int index=0; index < b1.length ; index++)
	      System.out.print("  "  + b1[index]);
	    
	    byte [] b2 = new byte[]{5,2,3,1,4};
	    Arrays.sort(b2,1,4)	;
	    
	    System.out.print("\nPartially Sorted byte array :\t ");
	    for(int index=0; index < b2.length ; index++)
	      System.out.print("  "  + b2[index]);

	    
	}
}

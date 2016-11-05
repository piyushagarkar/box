/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;


/**
 * @author User 37
 *
 */
public class SortLongArrayExample {

	public static void main(String[] args) {
		
		long [] l1 = new long []{3,2,5,4,1};
		
		System.out.println("Orignal Array ");
		
		for(int i = 0 ; i<l1.length; i++)
			System.out.println(" "+l1[i]);
		
		Arrays.sort(l1);
		
		System.out.println(" \nSorted long array :\t ");
			for(int i = 0; i<l1.length; i++)
				System.out.println(" " + l1[i]);
			
			long [] l2 = new long[]{5,2,3,1,4};
			
			 Arrays.sort(l2,1,4);

			    System.out.print("\nPartially Sorted long array :\t ");
			    for(int index=0; index < l2.length ; index++)
			      System.out.print("  "  + l2[index]);

			
	
	
	}
}

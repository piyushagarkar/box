/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;
/**
 * @author User 37
 *
 */
public class SortIntArrayExample {

	public static void main(String[] args) {
		
		int[] i1 = new int []{3,2,5,4,1};
		
		System.out.println("Original Array : ");
			for(int index = 0 ; index<i1.length ; index++)
				System.out.println("  "  + i1[index]);
			
			Arrays.sort(i1);
			

		    System.out.print("Sorted int array : ");
		    	for(int index = 0 ; index < i1.length; index++)
		    		System.out.println(" "+ i1[index]);
		    	

		        int[] i2 = new int[]{5,2,3,1,4};
		        Arrays.sort(i2,1,4);

		        
		        System.out.print("Partially Sorted int array : ");
		        for(int index=0; index < i2.length ; index++)
		          System.out.print("  "  + i2[index]);

	}
}

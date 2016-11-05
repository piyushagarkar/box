/**
 * 
 */
package com.ninescript.test.collection.sortingdemo7;

import java.util.Arrays;
/**
 * @author User 37
 *
 */
public class SortFloatArrayExample {

	public static void main(String[] args) {

		float[] f1 = new float[]{3f,2f,5f,4f,1f};

		System.out.print("Original Array :\t ");
		for(int index=0; index < f1.length ; index++)
			System.out.print("  "  + f1[index]);

		Arrays.sort(f1);

		System.out.print("\nSorted float array :\t ");
		for(int index=0; index < f1.length ; index++)
			System.out.print("  "  + f1[index]);


		float[] f2 = new float[]{5f,2f,3f,1f,4f};
		Arrays.sort(f2,1,4);


		System.out.print("\nPartially Sorted float array :\t ");
		for(int index=0; index < f2.length ; index++)
			System.out.print("  "  + f2[index]);

	}
}

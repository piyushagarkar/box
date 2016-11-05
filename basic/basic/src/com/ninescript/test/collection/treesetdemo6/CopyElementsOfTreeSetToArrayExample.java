/**
 * 
 */
package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;

/**
 * @author User 37
 *
 */
public class CopyElementsOfTreeSetToArrayExample {

	public static void main(String[] args) {
		
		TreeSet tSet = new TreeSet();
		
		tSet.add(new Integer("1"));
		tSet.add(new Integer("2"));
		tSet.add(new Integer("3"));
		tSet.add(new Integer("4"));
		tSet.add(new Integer("5"));
		
		Object [] array = tSet.toArray();
		System.out.println("TreeSet elements are copied into an Array. Now Array Contains..");
		for(int i = 0; i < array.length; i++)
	//		System.out.println(i);
			System.out.println(array[i]);

		
		
	}
}

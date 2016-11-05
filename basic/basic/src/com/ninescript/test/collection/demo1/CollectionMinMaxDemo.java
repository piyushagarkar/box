/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.*;

/**
 * @author User 37
 *
 */
public class CollectionMinMaxDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println(list);
		System.out.println("max: " + Collections.max(list));
		System.out.println("min: " + Collections.min(list));
	

	}

}

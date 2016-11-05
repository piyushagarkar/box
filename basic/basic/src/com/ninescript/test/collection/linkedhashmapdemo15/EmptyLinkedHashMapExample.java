/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.LinkedHashMap;
/**
 * @author Piyush
 *
 */

public class EmptyLinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		lHashMap.clear();
		
		System.out.println("Total key value pairs in LinkedHashMap are : " + lHashMap.size());

		
	}
}

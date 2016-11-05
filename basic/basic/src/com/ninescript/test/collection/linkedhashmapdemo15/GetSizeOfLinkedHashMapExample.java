/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.LinkedHashMap;


/**
 * @author Piyush
 *
 */
public class GetSizeOfLinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		
		System.out.println("Size of LinkedHashMap : " + lHashMap.size());

		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");
		System.out.println("Size of LinkedHashMap after addition : " + lHashMap.size());

		Object obj = lHashMap.remove("2");
		System.out.println("Size of LinkedHashMap after removal : " + lHashMap.size());

	}
}

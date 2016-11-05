/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.LinkedHashMap;

/**
 * @author User 37
 *
 */
public class CheckValueOfLinkedHashMapExample {

	
	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		boolean blnExists = lHashMap.containsValue("Two");
		System.out.println("Two exists in LinkedHashMap ? : "+blnExists);
	}
}

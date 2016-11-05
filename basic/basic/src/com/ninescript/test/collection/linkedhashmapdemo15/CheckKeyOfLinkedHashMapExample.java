/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.LinkedHashMap;
/**
 * @author Piyush
 *
 */
public class CheckKeyOfLinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");
		
		boolean blnExists = lHashMap.containsKey("3");
		System.out.println("3 exists in LinkedHashMap ? : " + blnExists);
		
	}
}

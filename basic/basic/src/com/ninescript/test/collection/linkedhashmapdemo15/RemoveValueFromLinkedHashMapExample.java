/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.LinkedHashMap;


/**
 * @author piyush
 *
 */
public class RemoveValueFromLinkedHashMapExample {
	
	public static void main(String[] args) {
		
	
	LinkedHashMap lHashMap = new LinkedHashMap();


	lHashMap.put("1", "One");
	lHashMap.put("2", "Two");
	lHashMap.put("3", "Three");


	Object obj = lHashMap.remove("2");
	System.out.println(obj + " Removed from LinkedHashMap");
	

	}

}
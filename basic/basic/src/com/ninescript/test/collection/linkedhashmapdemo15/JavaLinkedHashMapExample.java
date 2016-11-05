/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.LinkedHashMap;
/**
 * @author User 37
 *
 */
public class JavaLinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		

		lHashMap.put("One", new Integer(1));
		lHashMap.put("Two", new Integer(2));
		
		Object obj = lHashMap.get("One");
		System.out.println(obj);
	}
}

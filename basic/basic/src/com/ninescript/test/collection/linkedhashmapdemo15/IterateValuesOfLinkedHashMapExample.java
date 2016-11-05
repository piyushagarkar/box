/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
/**
 * @author piyush
 *
 */
public class IterateValuesOfLinkedHashMapExample {
	
	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		
		Collection c = lHashMap.values();
		
		Iterator itr = c.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}

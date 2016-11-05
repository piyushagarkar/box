/**
 * 
 */
package com.ninescript.test.collection.linkedhashmapdemo15;

import java.security.acl.LastOwnerException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
/**
 * @author piyush
 *
 */
public class GetSetViewOfKeysFromLinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lHashMap = new LinkedHashMap();
		
		lHashMap.put("1", "One");
		lHashMap.put("2", "Two");
		lHashMap.put("3", "Three");

		Set st = lHashMap.keySet();
		
		System.out.println("Set created from LinkedHashMap Keys contains :");
		
		
		Iterator itr = st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		st.remove("2");
		
		boolean blnExists = lHashMap.containsKey("2");
		System.out.println("Does LinkedHashMap contain 2 ? " + blnExists);
		
	}
}

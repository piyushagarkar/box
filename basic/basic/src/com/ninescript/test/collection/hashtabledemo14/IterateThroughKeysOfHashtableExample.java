/**
 * 
 */
package com.ninescript.test.collection.hashtabledemo14;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author User 37
 *
 */
public class IterateThroughKeysOfHashtableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable ht = new Hashtable();
		
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		Enumeration e = ht.elements();
		
		while (e.hasMoreElements()) 
			System.out.println(e.nextElement());
		
		
	}
	
}

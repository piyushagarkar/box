/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Collections;

/**
 * @author User 37
 *
 */
public class GetEnumerationOverHashSetExample {

	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");

		
		Enumeration e = Collections.enumeration(hashSet);
		
		System.out.println("Enumerating through Java HashSet");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
	}
}


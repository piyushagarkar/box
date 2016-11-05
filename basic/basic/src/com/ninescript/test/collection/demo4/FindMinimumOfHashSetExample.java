/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.HashSet;
import java.util.Collections;

/**
 * @author User 37
 *
 */
public class FindMinimumOfHashSetExample {
	public static void main(String[] args) {
		
			HashSet hashSet = new HashSet();

				hashSet.add(new Long("9254366345"));
				hashSet.add(new Long("555358382"));
				hashSet.add(new Long("2374324832"));
				hashSet.add(new Long("2855222213"));
				hashSet.add(new Long("12523554"));


				Object obj = Collections.min(hashSet);

				System.out.println("Minimum Element of Java HashSet is : " + obj);
	}

}

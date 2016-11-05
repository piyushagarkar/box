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
public class FindMaximumOfHashSetExample {
	
	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		
				hashSet.add(new Long("34654654"));
				hashSet.add(new Long("454656582"));
				hashSet.add(new Long("5565521332"));
				hashSet.add(new Long("243468322343"));
				hashSet.add(new Long("656742984"));
				
				 Object obj = Collections.max(hashSet);
				 

	System.out.println("Maximum Element of Java HashSet is : " + obj);
				
	}

}

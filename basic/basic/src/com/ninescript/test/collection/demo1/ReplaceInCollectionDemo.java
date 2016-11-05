/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.*;
/**
 * @author User 37
 *
 */
public class ReplaceInCollectionDemo {

	public static void main(String[] args) {
		
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List "+ list);
		Collections.replaceAll(list, "one", "hundread");
	     System.out.println("replaceAll: " + list);
		
	}
}

/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;
/**
 * @author Piyush
 *
 */
public class CheckKeyOfTreeMapExample {
	
	public static void main(String[] args) {
		
		
		TreeMap treeMap = new TreeMap();
		
		treeMap.put("1", "One");
		treeMap.put("2", "two");
		treeMap.put("3", "Tree");
		
		boolean blnExists = treeMap.containsKey("1");
		System.out.println("1 exists in TreeMap ? : " + blnExists);
		
	}

}

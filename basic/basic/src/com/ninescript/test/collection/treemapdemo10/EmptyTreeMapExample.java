/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;
/**
 * @author User 37
 *
 */
public class EmptyTreeMapExample {

	public static void main(String[] args) {
		
		TreeMap treeMap = new TreeMap();
		
	
		treeMap.put("1","One");
	    treeMap.put("2","Two");
	    treeMap.put("3","Three");

	    treeMap.clear();

	    System.out.println("Total key value pairs in TreeMap are : " + treeMap.size());
	    
		
	}
}


/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;

/**
 * @author User 37
 *
 */
public class GetSizeOfTreeMapExample {

	public static void main(String[] args) {
		
		TreeMap treeMap = new TreeMap();
		
		 System.out.println("Size of TreeMap : " + treeMap.size());

		    treeMap.put("1","One");
		    treeMap.put("2","Two");
		    treeMap.put("3","Three");
		    System.out.println("Size of TreeMap after addition : " + treeMap.size());


		    Object obj = treeMap.remove("2");
		    System.out.println("Size of TreeMap after removal : " + treeMap.size());

		
	}
}

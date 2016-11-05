/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;
/**
 * @author User 37
 *
 */
public class GetLowestHighestKeyTreeMapExample {

	public static void main(String[] args) {
		
		TreeMap treeMap = new TreeMap();
		
			treeMap.put("1","One");
		    treeMap.put("3","Three");
		    treeMap.put("2","Two");
		    treeMap.put("5","Five");
		    treeMap.put("4","Four");
		
		    System.out.println("Lowest key Stored in Java TreeMap is : "
                    + treeMap.firstKey());

		    System.out.println("Highest key Stored in Java TreeMap is : "
		                                                   + treeMap.lastKey());

	}
}

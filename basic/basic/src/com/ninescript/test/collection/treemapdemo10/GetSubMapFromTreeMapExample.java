/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;
import java.util.SortedMap;

/**
 * @author User 37
 *
 */
public class GetSubMapFromTreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeMap treeMap = new TreeMap();
		treeMap.put("1","One");
	    treeMap.put("3","Three");
	    treeMap.put("2","Two");
	    treeMap.put("5","Five");
	    treeMap.put("4","Four");


	    SortedMap sortedMap = treeMap.subMap("2","5");

	    System.out.println("SortedMap Contains : " + sortedMap);


	    
	}

}

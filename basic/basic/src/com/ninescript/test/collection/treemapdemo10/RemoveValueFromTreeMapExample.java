/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

/**
 * @author User 37
 *
 */

import java.util.TreeMap;

public class RemoveValueFromTreeMapExample {

	public static void main(String[] args) {


		TreeMap treeMap = new TreeMap();


		treeMap.put("1","One");
		treeMap.put("2","Two");
		treeMap.put("3","Three");




		Object obj = treeMap.remove("2");
		System.out.println(obj + " Removed from TreeMap");


	}


}

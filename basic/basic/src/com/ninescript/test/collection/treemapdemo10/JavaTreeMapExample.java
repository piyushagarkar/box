/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;

/**
 * @author User 37
 *
 */
public class JavaTreeMapExample {
	public static void main(String[] args) {

		TreeMap treeMap = new TreeMap();


		treeMap.put("One", new Integer(1));
		treeMap.put("Two", new Integer(2));

		Object obj = treeMap.get("Two");
		System.out.println(obj);  
	}

}

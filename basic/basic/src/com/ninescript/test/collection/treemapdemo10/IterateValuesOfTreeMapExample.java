/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;

/**
 * @author User 37
 *
 */
public class IterateValuesOfTreeMapExample {

	
	public static void main(String[] args) {

		TreeMap treeMap = new TreeMap();


		treeMap.put("1","One");
		treeMap.put("2","Two");
		treeMap.put("3","Three");

		Collection c = treeMap.values();

		Iterator itr = c.iterator();


		while(itr.hasNext())
			System.out.println(itr.next());
	}

}

/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Piyush
 *
 */
public class DifferentTypesOfCollectionDemo {

	public static void main(String[] args) {

		List lnkLst = new LinkedList();
		System.out.println(" ");
		lnkLst.add("element1");
		lnkLst.add("element2");
		lnkLst.add("element3");
		lnkLst.add("element4");
		displayAll(lnkLst);

		List aryLst = new ArrayList();
		System.out.println();
		aryLst.add("x");
		aryLst.add("y");
		aryLst.add("z");
		aryLst.add("w");
		displayAll(aryLst);


		Set hashSet = new HashSet();
		System.out.println();
		hashSet.add("set1");
		hashSet.add("set2");
		hashSet.add("set3");
		hashSet.add("set4");
		displayAll(hashSet);


		SortedSet treeSet = new TreeSet();
		System.out.println();
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("4");
		displayAll(treeSet);

		LinkedHashSet lnkHashset = new LinkedHashSet();
		System.out.println();
		lnkHashset.add("one");
		lnkHashset.add("two");
		lnkHashset.add("three");
		lnkHashset.add("four");
		displayAll(lnkHashset);

		Map map1 = new HashMap();
		System.out.println();
		map1.put("key1", "J");
		map1.put("key2", "K");
		map1.put("key3", "L");
		map1.put("key4", "M");
		displayAll(map1.keySet());
		displayAll(map1.values());

		SortedMap map2 = new TreeMap();
		System.out.println();
		map2.put("key1", "JJ");
		map2.put("key2", "KK");
		map2.put("key3", "LL");
		map2.put("key4", "MM");
		displayAll(map2.keySet());
		displayAll(map2.values());

		LinkedHashMap map3 = new LinkedHashMap();
		System.out.println();
		map3.put("key1", "JJJ");
		map3.put("key2", "KKK");
		map3.put("key3", "LLL");
		map3.put("key4", "MMM");
		displayAll(map3.keySet());
		displayAll(map3.values());

	}	
	
	
		static void displayAll(Collection col) {
		Iterator itr = col.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.print(str + " ");
		}
		System.out.println();


	}
}


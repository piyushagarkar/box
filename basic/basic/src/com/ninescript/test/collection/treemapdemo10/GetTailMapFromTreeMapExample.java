package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;
import java.util.SortedMap;

public class GetTailMapFromTreeMapExample {

	public static void main(String[] args) {
		
	    TreeMap treeMap = new TreeMap();

	    treeMap.put("1","One");
	    treeMap.put("3","Three");
	    treeMap.put("2","Two");
	    treeMap.put("5","Five");
	    treeMap.put("4","Four");


	    SortedMap sortedMap = treeMap.tailMap("2");

	    System.out.println("Tail Map Contains : " + sortedMap);

	}
	
}
/**
 * 
 */
package com.ninescript.piyush;

import java.util.Comparator;
import java.util.TreeMap;
/**
 * @author piyush
 *
 */
public class CustmiseHashMapDemo {

	public static void main(String[] args) {
	
		TreeMap treeMap = new TreeMap(new MyComparator());
		
		treeMap.put(100, "Piyush");
		treeMap.put(111,"Rahul");
		treeMap.put(120,"RohiT");
		treeMap.put(135, "pushkar");

		System.out.println(treeMap);
		
		
	}
	
}


class MyComparator implements Comparator{
	
	public int compare(Object obj1,Object obj2){
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
}
/**
 * 
 */
package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;
import java.util.SortedSet;
/**
 * @author User 37
 *
 */
public class GetSubSetFromTreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tSet = new  TreeSet();
		
			tSet.add("1");
		    tSet.add("3");
		    tSet.add("2");
		    tSet.add("5");
		    tSet.add("4");

		    
		    SortedSet sortedSet = tSet.subSet("2", "5");
		    System.out.println("SortedSet Contains : " + sortedSet);

		    
	}
}

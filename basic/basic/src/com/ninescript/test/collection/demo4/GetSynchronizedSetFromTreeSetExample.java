/**
 * 
 */
package com.ninescript.test.collection.demo4;


import java.util.TreeSet;
import java.util.Collections;
import java.util.Set;

/**
 * @author User 37
 *
 */
public class GetSynchronizedSetFromTreeSetExample {

	public static void main(String[] args) {

	TreeSet treeSet = new TreeSet();
	
	Set set = Collections.synchronizedSet(treeSet);
	
	}
}



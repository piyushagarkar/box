/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.Iterator;
import java.util.ArrayList;


/**
 * @author User 37
 *
 */
public class JavaIteratorExample {

	public static void main(String[] args) {
		
	
	ArrayList aList = new ArrayList();
	
	aList.add("1");
	aList.add("2");
	aList.add("3");
	aList.add("4");
	aList.add("5");

	Iterator itr = aList.iterator();
	
	while(itr.hasNext())
		System.out.println(itr.next());
	
	
	}
	
	
}

/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author User 37
 *
 */
public class ViewKeysDemo {

	public static void main(String[] args) {
		


		Hashtable ht1 = new Hashtable();
		ht1.put("1", "One");
		ht1.put("2", "Two");
		ht1.put("3", "Three");
		Enumeration e1 = ht1.keys();
		
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	
	}
	
}

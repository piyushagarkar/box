/**
 * 
 */
package com.ninescript.test.collection.hashtabledemo14;

import java.util.Hashtable;
/**
 * @author Piyush
 * 
 */
public class CheckValueOfHashtableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		boolean blnExists = ht.containsValue("Two");
		System.out.println("Two exists in Hashtable ? :  "+blnExists);
		
	}

}

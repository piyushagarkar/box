/**
 * 
 */
package com.ninescript.test.collection.hashtabledemo14;

import java.util.Hashtable;

/**
 * @author User 37
 *
 */
public class GetSizeOfHashtableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable ht = new Hashtable();
		
		System.out.println("Size of Hashtable : " + ht.size());

		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		System.out.println("Size of Hashtable after addition : " + ht.size());

		Object obj = ht.remove("2");
		System.out.println("Size of Hashtable after removal : " + ht.size());
	}

}

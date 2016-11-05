/**
 * 
 */
package com.ninescript.test.collection.hashtabledemo14;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author User 37
 *
 */
public class GetCollectionOfValuesFromHashtableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht = new Hashtable();
		
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		Collection c = ht.values();

		System.out.println("Values of Collection created from Hashtable are :");
		
		Iterator itr = c.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Hashtable values after removal from Collection are :");
		
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}

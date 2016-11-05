package com.ninescript.test.collection.hashtabledemo14;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


/**
 * 
 * @author User 37
 *
 */
public class GetSetViewOfKeysFromHashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Hashtable ht = new Hashtable();


		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");

		Set st = ht.keySet();

		System.out.println("Set created from Hashtable Keys contains :");

		Iterator itr = st.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());

		st.remove("2");

		System.out.println("Hashtable keys after removal from Set are :");
		Enumeration e = ht.keys();

		while (e.hasMoreElements()) 
			System.out.println(e.nextElement());

	}

}

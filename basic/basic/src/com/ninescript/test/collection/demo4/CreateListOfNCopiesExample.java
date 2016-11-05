/**
 * 
 */
package com.ninescript.test.collection.demo4;


import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/**
 * 
 * @author Piyush
 *
 */

public class CreateListOfNCopiesExample {

	public static void main(String[] args) {

		List list = Collections.nCopies(5, "A");

		System.out.println("List contains, ");
		Iterator itr = list.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

	}
}

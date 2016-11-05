/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * @author Piyush
 *
 */

public class UnmodifiableCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("This");
		list.add("is");
		list.add("Unmodifiable Collection");

		System.out.println("Element added to list: " + list.get(2));


		Collection<String> immutableCol = Collections.unmodifiableCollection(list);

		Iterator<String> iterator = immutableCol.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}


	}
}

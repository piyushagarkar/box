/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.*;
/**
 * @author User 37
 *
 */
public class CollectionRemoveElementDemo {

	public static void main(String[] args) {

		System.out.println("Collection Example!\n");
		int size;
		HashSet collection = new HashSet();

		String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";

		Iterator iterator ;

		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);

		System.out.print("Collection data: ");
		iterator = collection.iterator();

		while(iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println();
		collection.remove(str2);
		System.out.println("After removing [" + str2 + "]\n");
		System.out.print("Now collection data: ");
		iterator = collection.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();
		size = collection.size();
		System.out.println("Collection size: " + size + "\n");

	}
}

/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author User 37
 *
 */
public class GetEnumerationOverVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
				v.add("A");
				v.add("B");
				v.add("D");
				v.add("E");
				v.add("F");

				Enumeration e = Collections.enumeration(v);
				System.out.println("Enumerating through Java Vector");
				while(e.hasMoreElements())
					System.out.println(e.nextElement());
	}
}

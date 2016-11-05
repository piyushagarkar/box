/**
 * 
 */
package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;


/**
 * @author User 37
 *
 */
public class AddElementToSpecifiedIndexVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		v.add(1,"Inseted Element");
		
		System.out.println("Vecotr Contain.... "); 
		
		
		for (int i = 0; i < v.size(); i++) {

			System.out.println(v.get(i));
		}
	}

}

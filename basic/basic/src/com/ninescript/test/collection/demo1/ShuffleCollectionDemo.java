/**
 * 
 */
package com.ninescript.test.collection.demo1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author User 37
 *
 */
public class ShuffleCollectionDemo {

	public static void main(String[] args) throws Exception {
		
		ArrayList< String> obj = new ArrayList<String>();
		
		obj.add("A");
		obj.add("E");
		obj.add("I");
		obj.add("O");
		obj.add("U");

		Collections.shuffle(obj);
		System.out.println(obj);
		
	}
	
}

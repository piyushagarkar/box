/**
 * 
 */
package com.ninescript.test.collection.hashmapdemo13;

import java.util.HashMap;

/**
 * @author User 37
 *
 */
public class JavaHashMapExample {
	
	public static void main(String[] args) {
		  HashMap hMap = new HashMap();


		    hMap.put("One", new Integer(1));
		    hMap.put("Two", new Integer(2));

		  

		    Object obj = hMap.get("One");
		    System.out.println(obj);  

	}

}

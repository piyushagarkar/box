/**
 * 
 */
package com.ninescript.test.collection.hashmapdemo13;

import java.util.HashMap;

/**
 * @author User 37
 *
 */
public class CheckKeyOfHashMapExample {

	public static void main(String[] args) {
		
		HashMap hMap = new HashMap();
		
		hMap.put("1","One");
	    hMap.put("2","Two");
	    hMap.put("3","Three");

		
		boolean blnExists = hMap.containsKey("3");
	    System.out.println("3 exists in HashMap ? : " + blnExists);
	  
	}
}

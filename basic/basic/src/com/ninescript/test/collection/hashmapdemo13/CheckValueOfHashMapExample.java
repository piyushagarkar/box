/**
 * 
 */
package com.ninescript.test.collection.hashmapdemo13;

import java.util.HashMap;

/**
 * @author User 37
 *
 */
public class CheckValueOfHashMapExample {

	public static void main(String[] args) {
		
		HashMap hMap = new HashMap();
		

	    hMap.put("1","One");
	    hMap.put("2","Two");
	    hMap.put("3","Three");


	    boolean blnExists = hMap.containsValue("Two");
	    System.out.println("Two exists in HashMap ? : " + blnExists);
	  
	}
}

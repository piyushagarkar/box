/**
 * 
 */
package com.ninescript.test.collection.hashmapdemo13;

import java.util.HashMap;


/**
 * @author Piyush
 *
 */
public class RemoveValueFromHashMapExample {

	public static void main(String[] args) {
		
		HashMap hMap = new HashMap();
		
		  hMap.put("1","One");
		    hMap.put("2","Two");
		    hMap.put("3","Three");

		    Object obj = hMap.remove("2");
		    System.out.println(obj + " Removed from HashMap");

		  }
	}


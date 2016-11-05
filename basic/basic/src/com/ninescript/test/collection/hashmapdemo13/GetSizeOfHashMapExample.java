/**
 * 
 */
package com.ninescript.test.collection.hashmapdemo13;

import java.util.HashMap;


/**
 * @author User 37
 *
 */
public class GetSizeOfHashMapExample {

	public static void main(String[] args) {
		
		HashMap hMap = new HashMap();
		

	    System.out.println("Size of HashMap : " + hMap.size());

	    hMap.put("1","One");
	    hMap.put("2","Two");
	    hMap.put("3","Three");
	    System.out.println("Size of HashMap after addition : " + hMap.size());

	    Object obj = hMap.remove("2");
	    System.out.println("Size of HashMap after removal : " + hMap.size());
	  
	    
	}
}

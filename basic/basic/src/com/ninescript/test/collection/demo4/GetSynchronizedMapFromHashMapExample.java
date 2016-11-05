/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

/**
 * @author User 37
 *
 */
public class GetSynchronizedMapFromHashMapExample {

	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		
		Map map = Collections.synchronizedMap(hashMap);
	}
}

/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author User 37
 *
 */

public class GetSynchronizedMapFromTreeMapExample {

	public static void main(String[] args) {

		TreeMap treeMap = new TreeMap();

		Map map = Collections.synchronizedMap(treeMap);
	}
}

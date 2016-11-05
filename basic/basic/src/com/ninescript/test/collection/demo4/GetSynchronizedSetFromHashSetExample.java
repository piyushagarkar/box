/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/**
 * @author User 37
 *
 */

public class GetSynchronizedSetFromHashSetExample {

	public static void main(String[] args) {

		HashSet hashMap = new HashSet();


		Set set = Collections.synchronizedSet(hashMap);

	}
}

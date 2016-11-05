/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author User 37
 *
 */
public class GetSynchronizedListFromArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		List list = Collections.synchronizedList(arrayList);
		
		
	}
}

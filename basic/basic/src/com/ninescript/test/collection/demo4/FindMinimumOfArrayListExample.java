/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @author User 37
 *
 */
public class FindMinimumOfArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
	
		
		arrayList.add(new Integer("802348"));
		arrayList.add(new Integer("345308"));
		arrayList.add(new Integer("509324"));
		arrayList.add(new  Integer("3454524"));
		arrayList.add(new Integer("356465"));
		
		Object obj = Collections.min(arrayList);

		System.out.println("Minimum Element of Java ArrayList is : " + obj);


	}

}

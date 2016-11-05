/**
 * 
 */

package com.ninescript.test.collection.demo1;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * @author User 37
 *
 */
public class RemoveElementThroughIteratorExample {

	public static void main(String[] args) {
		
		ArrayList aList = new ArrayList();
		
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		System.out.println("ArrayList before removal : ");
		
		for (int i = 0 ; i < aList.size() ; i++)
			System.out.println(aList.get(i));
		
		Iterator itr = aList.iterator();
		
		String strElement = "";
		while (itr.hasNext()) {

			strElement = (String) itr.next();
			if (strElement.equals("2")) {
		
				
				itr.remove();
				break;
				
				}
			
			}
		
		System.out.println("ArrayList after removal : ");
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	}
}

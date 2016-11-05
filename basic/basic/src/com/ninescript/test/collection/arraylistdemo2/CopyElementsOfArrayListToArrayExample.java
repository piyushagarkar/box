package com.ninescript.test.collection.arraylistdemo2;

import java.util.*;

/**
 * 
 * @author piyush
 *
 */

public class CopyElementsOfArrayListToArrayExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		Object [] object =  arrayList.toArray();
		
		System.out.println("Now Arraylist Elements Are Converted into Array. Now Array Contain");
		
			for(int index=0; index < object.length ; index++)
			      System.out.println(object[index]);
			
	}
}

package com.ninescript.test.collection.arraylistdemo2;

import java.*;
import java.util.ArrayList;
import java.util.Collections;


public class SortJavaArrayListExample {

	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		

		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("5");
		arrayList.add("2");
		arrayList.add("4");

		System.out.println("Array List Befor Sorting In Ascending order"+ arrayList);
		Collections.sort(arrayList);
		
		System.out.println("ArrayList elements after sorting in ascending order : ");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
	}
}

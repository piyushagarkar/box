package com.ninescript.test.collection.arraylistdemo2;

import java.util.ArrayList;

public class RemoveElementFromArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
	
	
		Object obj = arrayList.remove(1);
		System.out.println(obj+ " Is Removed From ArrayList");
		
		System.out.println("Array List Contain");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		
	}
}

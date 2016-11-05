package com.ninescript.test.collection.arraylistdemo2;

import java.util.ArrayList;

public class ReplaceElementAtSpecifiedIndexArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList arrayList =new ArrayList();
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("8");
		arrayList.add("5");
		arrayList.add("7");
		
		arrayList.set(2, "Replaced element");
		
		System.out.println("Array List Contain");
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			System.out.println("ArrayList Is : "+ arrayList.get(i));
			
		}
		
		
		
	
	
	}
}

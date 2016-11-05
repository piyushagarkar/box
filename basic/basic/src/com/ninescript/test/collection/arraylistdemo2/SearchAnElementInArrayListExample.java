package com.ninescript.test.collection.arraylistdemo2;

import java.util.ArrayList;

public class SearchAnElementInArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		arrayList.add("1");
		arrayList.add("2");

		
		boolean bfound = arrayList.contains("2");
		System.out.println("Is Array List Contain 2 : " + bfound);
		
		int index = arrayList.indexOf("4");
		
		
		if(index == -1)
		
			System.out.println("Array list Does Not Contain 4 :");
		else
			System.out.println("Array List Contain 4 At Index :  " + index);
		
		
		int lastindex = arrayList.lastIndexOf("1");
		if (lastindex == -1) 
			System.out.println("Array List Does Not Contain 1");
		
		else
			
			System.out.println("Array List Conatain 1 : "+ lastindex);
		
		
		
	}
}

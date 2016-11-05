package com.ninescript.test.collection.iteratordemo9;

import java.util.ArrayList;
import java.util.ListIterator;

import com.ninescript.piyush.ArrayListMethods;

public class ReplaceAnElementUsingListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();
		
		arrList.add("1");
		arrList.add("2");
		arrList.add("3");
		arrList.add("4");
		
		ListIterator  listIterator = arrList.listIterator();
		
		listIterator.next();
		
		listIterator.set("100");
		
		
		System.out.println("After Replacing 1 to 100, Array List Contains");
		for ( int intindex = 0; intindex < arrList.size(); intindex++)
			System.out.println(arrList.get(intindex));
		
		
		
	}
}

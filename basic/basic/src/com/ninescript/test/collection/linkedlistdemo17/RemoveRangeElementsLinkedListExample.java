package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;
import java.util.List;

public class RemoveRangeElementsLinkedListExample {

	public static void main(String[] args) {

		LinkedList lList = new LinkedList();

		
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);

		
		lList.subList(2, 5).clear();

		System.out.println("Range of elements removed from LinkedList");
		System.out.println("LinkedList now contains : " + lList);
	}
}
package com.ninescript.test.collection.linkedlistdemo17;

import java.util.LinkedList;

public class RemoveAllElementsLinkedListExample {

	public static void main(String[] args) {


		LinkedList lList = new LinkedList();

		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		System.out.println("LinkedList contains : " + lList);


		lList.clear();
		System.out.println("LinkedList now contains : " + lList);


	}
}
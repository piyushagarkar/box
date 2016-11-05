package com.ninescript.test.collection.arraylistdemo2;

import java.util.*;

public class RemoveAllElementsOfArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrylist = new ArrayList();
		
		arrylist.add("1");
		arrylist.add("2");
		arrylist.add("3");
		arrylist.add("4");
		
		System.out.println("Size Of Array List Befor Removing Elements :  " + arrylist.size());

	
		arrylist.clear();
		
		System.out.println("Size Of Array List After Removing Elements :  " + arrylist.size());

	}
}

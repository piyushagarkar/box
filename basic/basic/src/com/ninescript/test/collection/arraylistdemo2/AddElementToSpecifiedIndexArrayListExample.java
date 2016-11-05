package com.ninescript.test.collection.arraylistdemo2;

import java.util.ArrayList;

/**
 * 
 * @author piyush
 *
 */


public class AddElementToSpecifiedIndexArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		
		arraylist.add(null);
		arraylist.add(1,"Piyush");
		arraylist.add("Rohit ");
		arraylist.add(4," Null");
		arraylist.add(4,"Ani");
		arraylist.add(4,"Ram");
		
		System.out.println("Array List Contain.... ");
		
		for(int index =0 ; index < arraylist.size(); index ++)
			System.out.println(arraylist.get(index));
		
		
	}
}

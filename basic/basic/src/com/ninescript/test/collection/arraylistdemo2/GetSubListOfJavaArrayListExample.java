package com.ninescript.test.collection.arraylistdemo2;

import java.util.*;

public class GetSubListOfJavaArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		
		List list = arraylist.subList(1, 3);
		
		System.out.println("SubList to List  ");
		
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
		

				Object obj = list.remove(0);
				System.out.println(obj + " is removed from sub list");

				
					
				for (int i = 0; i < arraylist.size(); i++)
					System.out.println(arraylist.get(i));

			

					
	}
	
	
}

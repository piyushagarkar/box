package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
/**
 * 
 * @author Piyush
 *
 */

public class RemoveElementFromVectorByObjectExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
				v.add("1");
				v.add("2");
				v.add("3");
				v.add("4");
				
				boolean blnElementFound  = v.remove("2");
				System.out.println("Was 2 removed from Vector ? " + blnElementFound);

				for (int i = 0; i < v.size(); i++) {
					
					System.out.println(v.get(i));
				}
				
				v.remove("3");
				System.out.println("Was 3 removed from Vector ? " + blnElementFound);
				System.out.println("Vector contents after removeElement call...");
				
				
				for (int index = 0; index < v.size(); index++)
					System.out.println(v.get(index));

				
				
	}
}

package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
import java.util.List;


/**
 * 
 * @author Piyush
 *
 */
public class GetSubListOfJavaVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
	    v.add("2");
	    v.add("3");
	    v.add("4");
	    v.add("5");

	    List lst = v.subList(1,3);

	    System.out.println("SubList contain :");
	    
	    for(int i =0 ; i<lst.size() ; i++)
	    	
	    	System.out.println(lst.get(i));
	    
	    
	    
	}
}

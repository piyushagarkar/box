/**
 * 
 */
package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;

/**
 * @author User 37
 *
 */
public class SearchAnElementFromSpecificIndexVectorExample {

	
	public static void main(String[] args) {
		

	    
	    Vector v = new Vector();

	    
	    v.add("1");
	    v.add("2");
	    v.add("3");
	    v.add("4");
	    v.add("5");
	    v.add("1");
	    v.add("2");
	
	    
	    int index =v.indexOf("1", 4);
	    
	    if(index == -1)
	    	System.out.println("Vector does not contain 1 after index # 4");
	    else
	    	System.out.println("Vector contains 1 after index # 4 at index #" + index);

	    	
	    int lastIndex = v.lastIndexOf("2" , 5);
	    if(lastIndex == -1)
	      System.out.println("Vector does not contain 2 after index # 5");
	    else
	      System.out.println("Last occurrence of 2  after index # 5 in Vector  is at index #" + lastIndex);
	    
	
	}
	
}

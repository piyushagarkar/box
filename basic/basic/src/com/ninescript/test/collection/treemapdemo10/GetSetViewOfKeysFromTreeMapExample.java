/**
 * 
 */
package com.ninescript.test.collection.treemapdemo10;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author User 37
 *
 */
public class GetSetViewOfKeysFromTreeMapExample {

	public static void main(String[] args) {
		
		

	    TreeMap treeMap = new TreeMap();

	    treeMap.put("1","One");
	    treeMap.put("3","Three");
	    treeMap.put("2","Two");
	    
	    Set st = treeMap.keySet();
	    
	    System.out.println("Set created from TreeMap Keys contains :");

	    Iterator itr = st.iterator();
	    while(itr.hasNext()){
	    	System.out.println(itr.next());
	    }
	    
	    st.remove("1");

	    boolean blnExists = treeMap.containsKey("1");
	    System.out.println("Does TreeMap contain 1 ? " + blnExists);
	  
	    
	}
}

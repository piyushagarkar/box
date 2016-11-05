/**
 * 
 */
package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;



/**
 * @author User 37
 *
 */
public class RemoveSpecifiedElementFromTreeSetExample {

	public static void main(String[] args) {

	TreeSet tSet = new TreeSet();
	

    tSet.add(new Integer("1"));
    tSet.add(new Integer("2"));
    tSet.add(new Integer("3"));


    boolean blnRemoved = tSet.remove(new Integer("2"));
    
    System.out.println("Was 2 removed from TreeSet ? " + blnRemoved);

    System.out.println("TreeSet after removal : " + tSet);
  
    
	}

}

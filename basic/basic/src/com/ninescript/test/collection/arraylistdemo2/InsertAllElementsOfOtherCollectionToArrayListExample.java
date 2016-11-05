package com.ninescript.test.collection.arraylistdemo2;

import java.util.*;

/**
 * 
 * @author piyush
 *
 */

public class InsertAllElementsOfOtherCollectionToArrayListExample {

	public static void main(String[] args) {
	
	ArrayList arrylist = new ArrayList();
	
	arrylist.add("1");
	arrylist.add("2");
	arrylist.add("3");
	//arrylist.add("4");
	
System.out.println("Normal Array List IS Before Opertion ");
System.out.println(arrylist);
	
	Vector v = new Vector<>();
	v.add("4");
	v.add("5");
	

	arrylist.addAll(1,v);
	
	System.out.println("After Inserting All Elements of Vector To Array lIst to at index 1");
	
	for(int index=0;index<arrylist.size();index ++)
		System.out.println(arrylist.get(index));
	
	}

}

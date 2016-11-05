package com.ninescript.piyush;

import java.util.Hashtable;

/**
 * 
 * @author User 37
 *
 */
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		
		ht.put(new Temp1(5), "A");
		ht.put(new Temp1(2), "B");
		ht.put(new Temp1(6), "K");
		ht.put(new Temp1(15), "F");
		ht.put(new Temp1(23), "AnuPriya");
		ht.put(new Temp1(16), "Piyush");
	// 	h.put("Durga",null);
		
		System.out.println(ht);
		
	}

}

class Temp1{
	
	int i ;
	Temp1(int i ){
		this.i = i ;
	}
	
	public int hashCode(){
		return i;
	}
	
	public String toString(){
		return i + " ";
	}
	
	
}
package com.ninescript.piyush;
/**
 * 
 * @author Piyush 
 *
 */

/*
 * Using Method toString();
 */

public class Student {
	
	int rollNo;
	String name,city;
	
	Student(int rollNo,String name,String city){
			
			this.rollNo=rollNo;
			this.name=name;
			this.city=city;
	}
	
	public String toString(){
		System.out.println(rollNo+" "+name+" "+city);
		return null;
	}

		public static void main(String[] args) {
			
		Student s=new Student(102,"piyush","Kolhapur");			
			System.out.println(s);
}
}


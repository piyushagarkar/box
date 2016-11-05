package com.ninescript.test.staticDemo.staticmethods;

public class Student 
{
	  private String name;        // Object variable
	    private int age;            // Object variable
	    private String studentId;   // Object variable
	    private static int numberOfStudents = 0; // Class variable

	    public Student(String name, int age, String studentId)
	    {

	        this.name= name;
	        this.age= age;
	        this.studentId= studentId;

	        // Increase the number of students whenever an object is created
	        numberOfStudents ++;
	    }

	    public static int getNumberOfStudents ()
	    {
	       return numberOfStudents ;
	    }

}

package com.ninescript.test.staticDemo.staticmethods;

public class Program
{
   
	public static void main(String args[]) 
	{

        System.out.println("Number of students in the beginning: " + Student.getNumberOfStudents());

        // Create two student object
        Student student1 = new Student("Obi-Wan Kenobi", 19, "2010001");
        Student student2 = new Student("Anakin Skywalker", 16, "2010002");

        int numberOfStudents = Student.getNumberOfStudents();
        System.out.println("Number of students: " + numberOfStudents);

    }
}



package com.ninescript.polymorphism;

/**
 * 
 * @author Piyush
 *
 */

		class Animal

		{

		   public void move()
		   {
		      System.out.println("Animals can move");
		   }
		
		}

		class Dog extends Animal
		{

		   public void move()
		   {
		      System.out.println("Dogs can walk and run");
		   }
		   
		   public void bark()
		   {
		      System.out.println("Dogs can bark");
		   }
		}

		public class OverridingUse2
		{

		   public static void main(String args[])
		   {
		      Animal a = new Animal();
		      Animal b = new Dog(); 
		      a.move();
		      //b.move();
		      
		      Dog D = new Dog();
		      D.move();
		      D.bark();
		     
		   }
		}
	



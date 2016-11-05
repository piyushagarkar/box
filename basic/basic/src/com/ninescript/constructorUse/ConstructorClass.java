package com.ninescript.constructorUse;

/**
 * 
 * @author Piyush
 *
 */

public class ConstructorClass
{
     
        int id;  
        String name;  
        
        ConstructorClass(int i,String n)
        	{  
        		id = i;  
        		name = n;  
        	}  
          
        ConstructorClass(ConstructorClass s)
        	{  
        		id = s.id;  
        		name =s.name;  
        	}  
        
        void display()
        	{
        		System.out.println(id+" "+name);
        	}  
       
        public static void main(String args[])
        	{  
        		ConstructorClass s1 = new ConstructorClass(111,"Karan");  
        		ConstructorClass s2 = new ConstructorClass(s1);  
        		s1.display();  
        		s2.display();  
        	}  
    }  


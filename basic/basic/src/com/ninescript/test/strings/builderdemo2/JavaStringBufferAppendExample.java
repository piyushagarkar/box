package com.ninescript.test.strings.builderdemo2;



public class JavaStringBufferAppendExample {
  
   
      public static void main(String[] args) {
 
      
       
   
     boolean b = true;
     
   StringBuffer sb1 =  new StringBuffer("BooelanAppended : ");
   
     sb1.append(b);
     
   System.out.println(sb1);
   
    
        //StringBuffer append(char c) method appends character to StringBuffer object
 
       char c = 'Y';
 
       StringBuffer sb2 =  new StringBuffer("CharAppended : ");
 
       sb2.append(c);
    
    System.out.println(sb2);
       

       
   char[] c1 = new char[] {'Y','e','s'};
    
    StringBuffer sb3 =  new StringBuffer("Character Array Appended : ");
   
     sb3.append(c1);
        System.out.println(sb3);
     
 
      
      double d = 1.0;
      
  StringBuffer sb4 =  new StringBuffer("doubleAppended : ");
  
      sb4.append(d);
     
   System.out.println(sb4);
       
    
    
      float f = 1.0f;
    
    StringBuffer sb5 =  new StringBuffer("floatAppended : ");
 
       sb5.append(f);
    
    System.out.println(sb5);
     
       
 
  
      int i = 1;
   
     StringBuffer sb6 =  new StringBuffer("integerAppended : ");
    
    sb6.append(i);
       
 System.out.println(sb6);
     
      
  
  
      long l = 1;
        StringBuffer sb7 =  new StringBuffer("longAppended : ");
   
     sb7.append(l);
       
 System.out.println(sb7);
     

        
     
   Object obj = new String("Yes");
  
      StringBuffer sb8 =  new StringBuffer("ObjectAppended : ");
   
     sb8.append(obj);
   
     System.out.println(sb8);
       

        
     
   String str = new String("Yes");
    
    StringBuffer sb9 =  new StringBuffer("StringAppended : ");
 
       sb9.append(str);
    
    System.out.println(sb9);
      
 
  
    }
  
  }
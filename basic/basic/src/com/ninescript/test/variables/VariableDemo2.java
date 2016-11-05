package com.ninescript.test.variables;
/**
 * @author piyush
 *
 *
*/

public class VariableDemo2
 {


  static int staticVariable = 1;
  

  public int instanceVariable = 1;

  public static void main(String[] args)
  {
  
    
    int methodLevelLocalVariable = 3;
    
    
    String newLine = System.getProperty("line.separator");
    
    System.out.println("Static variable value : " + staticVariable + newLine);
    
    
    System.out.println("Method level variable value : " + methodLevelLocalVariable + newLine);
    {
      
      int blockLevelVariable = 3;
      System.out.println("Block level variable value : " + blockLevelVariable);
    }
  }
}


